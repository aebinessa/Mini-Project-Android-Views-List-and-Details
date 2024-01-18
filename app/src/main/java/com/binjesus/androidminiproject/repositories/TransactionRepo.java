package com.binjesus.androidminiproject.repositories;

import com.binjesus.androidminiproject.models.Transaction;


import com.binjesus.androidminiproject.models.Transaction;
import com.binjesus.androidminiproject.models.TransactionType;

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

        transactions.add(new Transaction(2131,1,"date",98,323, TransactionType.DEPOSIT));
        transactions.add(new Transaction(3142,2,"date",100,900, TransactionType.WITHDRAWAL));
        transactions.add(new Transaction(4234,3,"date",30,60, TransactionType.DEPOSIT));
        transactions.add(new Transaction(3253,4,"date",50,400, TransactionType.WITHDRAWAL));
        transactions.add(new Transaction(3524,5,"date",90,230, TransactionType.DEPOSIT));
        transactions.add(new Transaction(3255,6,"date",233,445, TransactionType.WITHDRAWAL));


        return transactions;
}


}

