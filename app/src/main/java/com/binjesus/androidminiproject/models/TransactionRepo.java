package com.binjesus.androidminiproject.models;

import java.util.ArrayList;

public class TransactionRepo {
    private static TransactionRepo instance;
    private TransactionRepo(){}
    public static TransactionRepo getInstance(){
        if (instance == null)
            instance = new TransactionRepo();
        return instance;
}
    public ArrayList<Transaction> generateDummyTransactionList(){
        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(333,555,"today",4444,555));
        transactions.add(new Transaction(333,555,"today",4444,555));
        transactions.add(new Transaction(333,555,"today",4444,555));
        transactions.add(new Transaction(333,555,"today",4444,555));
        transactions.add(new Transaction(333,555,"today",4444,555));
        transactions.add(new Transaction(333,555,"today",4444,555));





        return transactions;
}}

