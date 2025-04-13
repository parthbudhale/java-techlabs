package entity;

public class Account {
    private int accountNo;
    private int userId;
    private double balance;
  

    public Account(int accountNo, int userId, double balance) {
        this.accountNo = accountNo;
        this.userId = userId;
        this.balance = balance;
      
    }

    public Account() {}

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

 
    

  
}