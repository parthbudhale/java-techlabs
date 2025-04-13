package entity;

public class Transaction {
    private int transactionId;
    private int senderId;
    private int receiverId;
    private String type;
    private double amount;
    private String transactionDate;

    public Transaction() {}

    public Transaction(int transactionId, int senderId, int receiverId, String type, double amount,String transactionDate) {
        this.transactionId = transactionId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.type = type;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getsenderId() {
        return senderId;
    }

    public void setsenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getreceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
}
