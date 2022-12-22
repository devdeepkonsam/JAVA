package com.devdeep.banking;

import java.util.ArrayList;

public class Account {
    //the name of account
    private String name;
    //unique id
    private String uid;
    //the user object that owns this aacount
    private User holder;
    

    //the list of transactioin for this account
    private ArrayList<Transaction> transactions;

    /**Create new Account 
     * @param name  the name of the account
     * @param holder the user objects that holds the account
     * @param theBank the bank that issue the account
     */
    public Account(String name ,User holder , Bank theBank){
        // set the account nmae and holder
        this.name = name;
        this.holder =holder;

        //get the account uuid
        this.uid = theBank.getAccountUID();

        //initialize transaction
        this.transactions = new ArrayList<Transaction>();

        //add to holder and bank list

    }

    public String getUID() {
        return this.uid;
    }

    /**
     * @return get summary of the account
     */
    public String getSummaryline() {
        //get the account balance
        double balance = this.getBalance();
         
        //format the summary line depending on the whether the balance is 
        //negative
        if (balance>=0) {
            return String.format("%s : RS.%.02f: %s " ,this.uid,balance,this.name);
        }else{
            return String.format("%s : RS.(%.02f): %s " ,this.uid,balance,this.name);
        }
    }

    double getBalance() {
       double balance =0;
       for (Transaction transaction : transactions) {
        balance  += transaction.getamount();
       }
       return balance;
    }

    /**
     * 
     */
    public void printTransaction() {
        System.out.printf("\n Transaction History for account %s \n",this.uid);
        for (int t = this.transactions.size()-1;t>=0;t--) {
            System.out.printf(this.transactions.get(t).getSummaryline());
            System.out.println();
        }
        System.out.println();
    }

    /**
     * @param amount
     * @param memo
     */
    public void addTransaction(double amount, String memo) {
        //create new transaction 
        Transaction newTrans = new Transaction(amount, memo,this);
        this.transactions.add(newTrans);
    }

    public User getHolder() {
        return this.holder;
    }
    
}
