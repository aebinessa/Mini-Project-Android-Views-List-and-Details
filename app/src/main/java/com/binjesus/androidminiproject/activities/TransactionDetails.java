package com.binjesus.androidminiproject.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.binjesus.androidminiproject.R;

public class TransactionDetails extends AppCompatActivity {

    private TextView textTransactionDetails,textTransactionID,textTransactionTypeDetails,textViewDate,textTransactionAmountDetails,textTransactionBalanceDetails,textTransactionAccountDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);


        textTransactionDetails = findViewById(R.id.textTransactionDetails);
        textTransactionID = findViewById(R.id.textTransactionID);
        textTransactionTypeDetails = findViewById(R.id.textTransactionTypeDetails);
        textViewDate = findViewById(R.id.textViewDate);
        textTransactionAmountDetails = findViewById(R.id.textTransactionAmountDetails);
        textTransactionBalanceDetails = findViewById(R.id.textTransactionBalanceDetails);
        textTransactionAccountDetails = findViewById(R.id.textTransactionAccountDetails);

    }
}