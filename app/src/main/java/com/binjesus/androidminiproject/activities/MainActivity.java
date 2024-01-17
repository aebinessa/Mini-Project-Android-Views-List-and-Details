package com.binjesus.androidminiproject.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.binjesus.androidminiproject.R;
import com.binjesus.androidminiproject.models.Transaction;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Transaction> transactions = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}