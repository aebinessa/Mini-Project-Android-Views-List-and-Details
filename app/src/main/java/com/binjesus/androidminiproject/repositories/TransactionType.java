package com.binjesus.androidminiproject.repositories;

public enum TransactionType {
    WITHDRAWAL("Withdrawal"), DEPOSIT("Deposit"),
    ;
    private final String value;


    TransactionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
