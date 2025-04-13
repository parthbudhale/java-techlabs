package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Account;
import entity.Transaction;
import exceptions.InsufficientBalanceException;

public class TransactionOperations {
    private Connection con;
    private AccountOperations accOps;

    public TransactionOperations() {
        this.con = DatabaseConnection.getObject().getConnection();
        accOps = new AccountOperations();
    }

    public boolean addTransaction(int senderNo, int receiverNo, String type, double amount) {
    	String sql = "INSERT INTO transactions(sender_id, receiver_id, type, amount, transaction_date) VALUES (?, ?, ?, ?, NOW())";
    	try (
    	     PreparedStatement ps = con.prepareStatement(sql)) {

    		if (type.equals("deposit")) {
    			ps.setNull(1, java.sql.Types.INTEGER);
    			ps.setInt(2, receiverNo);             
    		} else if (type.equals("withdraw")) {
    			ps.setInt(1, senderNo);               
    			ps.setNull(2, java.sql.Types.INTEGER); 
    		} else if (type.equals("transfer")) {
    			ps.setInt(1, senderNo);
    			ps.setInt(2, receiverNo);
    		}

    		ps.setString(3, type);
    		ps.setDouble(4, amount);
    	

    		int rows = ps.executeUpdate();
    		return rows > 0;
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return false;
    }

    public List<Transaction> getTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        String query = "SELECT * FROM transactions ORDER by transaction_date desc";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Transaction txn = new Transaction(
                        rs.getInt("transaction_id"),
                        rs.getInt("sender_id"),
                        rs.getInt("receiver_id"),
                        rs.getString("type"),
                        rs.getDouble("amount"),
                       
                        rs.getString("transaction_date"));
                transactions.add(txn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
    
    public List<Transaction> getFilteredTransactions(String type, String sort, String order) {
    	List<Transaction> transactions = new ArrayList<>();

    	try{
    		String sql = "SELECT * FROM transactions WHERE (? = '' OR type = ?) ORDER BY " + sort + " " + order;

    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setString(1, type);
    		ps.setString(2, type);

    		ResultSet rs = ps.executeQuery();
    		while (rs.next()) {
    			Transaction transaction = new Transaction(
    					rs.getInt("transaction_id"),
    					rs.getInt("sender_id"),
    					rs.getInt("receiver_id"),
    					rs.getString("type"),
    					rs.getDouble("amount"),
    					rs.getString("transaction_date"));
    			transactions.add(transaction);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return transactions;
    }

    public List<Transaction> getTransactionsByAccountNo(int accountNo) {
    	List<Transaction> transactions = new ArrayList<>();
    	try (PreparedStatement ps = con.prepareStatement("SELECT * FROM transactions WHERE sender_id = ? OR receiver_id = ? ORDER BY transaction_date DESC")) {
    		ps.setInt(1, accountNo);
    		ps.setInt(2, accountNo);
    		ResultSet rs = ps.executeQuery();
    		while (rs.next()) {
    			Transaction transaction = new Transaction(
    					rs.getInt("transaction_id"),
    					rs.getInt("sender_id"),
    					rs.getInt("receiver_id"),
    					rs.getString("type"),
    					rs.getDouble("amount"),
    					rs.getString("transaction_date"));
    			transactions.add(transaction);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return transactions;
    }

    public void deposit(int accNo, double amount) throws Exception {
    	Account acc = accOps.getAccountByUserId(accNo);
    	acc.setBalance(acc.getBalance() + amount);
    	if(!accOps.updateAccount(acc)) {
    		System.out.println("Failed to update");
    		return;
    	}
    	System.out.println("Updated successfully");
    	addTransaction(accNo, accNo, "deposit", amount);
    }

    public void withdraw(int accNo, double amount) throws Exception {
    	Account acc = accOps.getAccountByUserId(accNo);
    	if (acc.getBalance() < amount) {
    		throw new InsufficientBalanceException();
    	}
    	acc.setBalance(acc.getBalance() - amount);
    	if(!accOps.updateAccount(acc)) {
    		System.out.println("Failed to update");
    		return;
    	}
    	System.out.println("Updated successfully");
    	addTransaction(accNo, accNo, "withdraw", amount);
    }

    public void transfer(int senderNo, int receiverNo, double amount) throws Exception {
    	Account senderAcc = accOps.getAccountByUserId(senderNo);
    	Account receiverAcc = accOps.getAccountByUserId(receiverNo);
    

    	if (senderAcc.getBalance() < amount) {
    		throw new InsufficientBalanceException();
    	}

    	senderAcc.setBalance(senderAcc.getBalance() - amount);
    	receiverAcc.setBalance(receiverAcc.getBalance() + amount);

    	if(!accOps.updateAccount(senderAcc)) {
    		System.out.println("Failed to update");
    		return;
    	}
    	System.out.println("Updated successfully");
    	if(!accOps.updateAccount(receiverAcc)) {
    		System.out.println("Failed to update");
    		return;
    	}
    	System.out.println("Updated successfully");
    	addTransaction(senderNo, receiverNo, "transfer", amount);
    }

}
