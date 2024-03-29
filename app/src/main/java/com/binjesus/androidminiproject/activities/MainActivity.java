package com.binjesus.androidminiproject.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.binjesus.androidminiproject.R;
import com.binjesus.androidminiproject.TransactionItemListener;
import com.binjesus.androidminiproject.adapter.TransactionAdapter;
import com.binjesus.androidminiproject.models.Transaction;
import com.binjesus.androidminiproject.repositories.TransactionRepo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TransactionItemListener {


    RecyclerView transactionRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Transaction> transactionsArrayList = TransactionRepo.getInstance().generateDummyTransactionList();
        transactionRecyclerView =findViewById(R.id.transactionRecyclerView);
        TransactionAdapter adapter = new TransactionAdapter(transactionsArrayList, this);
        transactionRecyclerView.setAdapter(adapter);
        transactionRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onTransactionItemClicked(Transaction transaction) {
        Intent intent = new Intent(MainActivity.this, TransactionDetails.class);
        intent.putExtra("TRANSACTION_KEY", transaction);
        startActivity(intent);

    }
}