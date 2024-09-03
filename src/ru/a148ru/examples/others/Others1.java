package ru.a148ru.examples.others;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Others1{
    static List<Transaction> transactions= new ArrayList<Transaction>();

    public static void main(String[] args) {

        Map<Currency, List<Transaction>> transactionByCurrencies = new HashMap<>();

        for(Transaction transaction : transactions){
            if(transaction.getPrice() > 1000){
                Currency currency = transaction.getCurrency();
                List<Transaction> transactionsForCurrency = transactionByCurrencies.get(currency);
                if(transactionsForCurrency == null){
                    transactionsForCurrency = new ArrayList<>();
                    transactionByCurrencies.put(currency, transactionsForCurrency);
                }
                transactionsForCurrency.add(transaction);

            }
        }
    }
}