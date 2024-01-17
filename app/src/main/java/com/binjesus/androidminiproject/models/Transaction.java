package com.binjesus.androidminiproject.models;
enum transactionType{
    WITHDRAWAL,
    DEPOSIT,
    TRANSFER;

}
public class Transaction {

    private int id, account;
    private String date;
    private double amount, balance;

    public Transaction(int id, int account, String date, double amount, double balance) {
        this.id = id;
        this.account = account;
        this.date = date;
        this.amount = amount;
        this.balance = balance;
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


}
