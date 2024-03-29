package com.binjesus.androidminiproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.binjesus.androidminiproject.R;
import com.binjesus.androidminiproject.TransactionItemListener;
import com.binjesus.androidminiproject.models.Transaction;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {

    private static TransactionItemListener transactionItemListener;
    private static ArrayList<Transaction> transactions;
    public TransactionAdapter(ArrayList<Transaction> transactions, TransactionItemListener transactionItemListener) {
        this.transactions = transactions;
        this.transactionItemListener = transactionItemListener;
    }


    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.transaction_card,
                parent,
                false);
        return new TransactionViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        holder.textViewDate.setText(transactions.get(position).getDate());

        holder.textViewAmount.setText("Amount "+"$"+String.valueOf(transactions.get(position).getAmount()));
        holder.textViewBalance.setText("Balance "+"$"+ String.valueOf(transactions.get(position).getBalance()));
        holder.textViewAccount.setText(String.valueOf(transactions.get(position).getAccount()));

        holder.textViewtype.setText(String.valueOf(transactions.get(position).getType()));






    }


    public static class TransactionViewHolder extends RecyclerView.ViewHolder{



        private TextView textViewDate;
        private TextView textViewtype;
        private TextView textViewAmount;
        private TextView textViewBalance;
        private TextView textViewAccount;

        public TransactionViewHolder (@NonNull View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewtype = itemView.findViewById(R.id.textViewType);
            textViewAmount = itemView.findViewById(R.id.textViewAmount);
            textViewBalance = itemView.findViewById(R.id.textViewBalance);
            textViewAccount = itemView.findViewById(R.id.textViewAccount);

            itemView.setOnClickListener(v -> {
                transactionItemListener.onTransactionItemClicked(transactions.get(getAdapterPosition()));
            });

        }
    }
    @Override
    public int getItemCount() {
        return transactions.size();
    }
}


