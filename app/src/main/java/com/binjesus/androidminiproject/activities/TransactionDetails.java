package com.binjesus.androidminiproject.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.binjesus.androidminiproject.R;
import com.binjesus.androidminiproject.models.Transaction;

public class TransactionDetails extends AppCompatActivity {

    private TextView textTransactionDetails,textTransactionID,textTransactionTypeDetails,textViewDate,textTransactionAmountDetails,textTransactionBalanceDetails,textTransactionAccountDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);


        textTransactionID = findViewById(R.id.textTransactionID);
        textTransactionTypeDetails = findViewById(R.id.textTransactionTypeDetails);
        textViewDate = findViewById(R.id.textViewDate);
        textTransactionAmountDetails = findViewById(R.id.textTransactionAmountDetails);
        textTransactionBalanceDetails = findViewById(R.id.textTransactionBalanceDetails);
        textTransactionAccountDetails = findViewById(R.id.textTransactionAccountDetails);

        Transaction transaction = getIntent().getSerializableExtra("TRANSACTION_KEY", Transaction.class);
        textTransactionID.setText("ID: "+String.valueOf(transaction.getId()));
        textViewDate.setText("Date: "+String.valueOf(transaction.getDate()));
        textTransactionAmountDetails.setText("Amount: "+String.valueOf(transaction.getAmount()));
        textTransactionBalanceDetails.setText("Balance: "+String.valueOf(transaction.getBalance()));
        textTransactionAccountDetails.setText("Account: "+String.valueOf(transaction.getAccount()));



    }
}