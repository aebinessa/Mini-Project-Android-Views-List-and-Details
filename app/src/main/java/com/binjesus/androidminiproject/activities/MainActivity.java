package com.binjesus.androidminiproject.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.binjesus.androidminiproject.R;
import com.binjesus.androidminiproject.adapter.TransactionAdapter;
import com.binjesus.androidminiproject.models.Transaction;
import com.binjesus.androidminiproject.repositories.TransactionRepo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView transactionRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Transaction> Transaction = TransactionRepo.getInstance().generateDummyTransactionList();
        transactionRecyclerView =findViewById(R.id.transactionRecyclerView);
        TransactionAdapter adapter = new TransactionAdapter(Transaction);
        transactionRecyclerView.setAdapter(adapter);
        transactionRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}