package com.binjesus.androidminiproject.models;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction implements Serializable {

    private int id, account;
    private String date;
    private double amount, balance;

    private TransactionType type;






    public Transaction(int id, int account, String date, double amount, double balance, TransactionType type) {
        this.id = id;
        this.account = account;
        this.date = getCurrentDate();
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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getCurrentDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       return dateFormat.format(new Date());
    }
}

