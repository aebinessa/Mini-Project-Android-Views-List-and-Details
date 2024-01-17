package com.binjesus.androidminiproject.repositories;

import com.binjesus.androidminiproject.models.Transaction;


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
        transactions.add(new Transaction(1,1,"2024",2,2, TransactionType.DEPOSIT));
        transactions.add(new Transaction(1,1,"2024",2,2, TransactionType.WITHDRAWAL));
        transactions.add(new Transaction(1,1,"2024",2,2, TransactionType.DEPOSIT));
        transactions.add(new Transaction(1,1,"2024",2,2, TransactionType.DEPOSIT));
        transactions.add(new Transaction(1,1,"2024",2,2, TransactionType.DEPOSIT));
        transactions.add(new Transaction(1,1,"2024",2,2, TransactionType.DEPOSIT));
//





        return transactions;
}}

