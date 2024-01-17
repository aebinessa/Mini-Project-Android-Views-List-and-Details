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
        transactions.add(new Transaction(1,1,"2024",2,2,transactionType.DEPOSIT));
        transactions.add(new Transaction(1,1,"2024",2,2,transactionType.WITHDRAWAL));
        transactions.add(new Transaction(1,1,"2024",2,2,transactionType.DEPOSIT));
        transactions.add(new Transaction(1,1,"2024",2,2,transactionType.DEPOSIT));
        transactions.add(new Transaction(1,1,"2024",2,2,transactionType.DEPOSIT));
        transactions.add(new Transaction(1,1,"2024",2,2,transactionType.DEPOSIT));
//





        return transactions;
}}

