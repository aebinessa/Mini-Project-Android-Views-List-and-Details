package com.binjesus.androidminiproject.models;
 public enum transactionType{
    WITHDRAWAL("Withdrawal"), DEPOSIT ("Diposit"),;
    private final String value;



    transactionType(String value){
        this.value=value;
    }
    public String getValue() {
        return value;
    }




}
public class Transaction {

    private int id, account;
    private String date;
    private double amount, balance;




    private transactionType type;

    public Transaction(int id, int account, String date, double amount, double balance,transactionType type) {
        this.id = id;
        this.account = account;
        this.date = date;
        this.amount = amount;
        this.balance = balance;
        this.type = type;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public transactionType getType() {
        return type;
    }

    public void setType(transactionType type) {
        this.type = type;
    }
}

