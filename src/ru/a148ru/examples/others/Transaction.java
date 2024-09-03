package ru.a148ru.examples.others;

import java.util.Currency;

public class Transaction {
    private final double Price;
    private final Currency currency;

    public Transaction(double price, Currency currency){
        Price = price;
        this.currency = currency;
    }

    public double getPrice(){
        return Price;
    }

    public Currency getCurrency() {
        return currency;
    }
}
