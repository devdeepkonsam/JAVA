package com.devdeep.banking;

import java.util.Date;

public class Transaction {
    //the amount of transaction
    private double amount;
    //date and time of this transaction
    private Date timestamp;
    //a memeo of transaction
    private String memo;
    //the account in which the transaction was performed
    private Account inAccount;


    

    /**
     * @param amount
     * @param inAccount
     */
    public Transaction (double amount ,Account inAccount){

        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo ="";
    }

    /**
     * @param amount
     * @param memo
     * @param inAccount
     */
    public Transaction(double amount , String memo , Account inAccount ){
        //cal the two arg constructor
        this(amount, inAccount);

        //set the memo 
        this.memo = memo;
    }

    public double getamount() {
        return this.amount;
    }

    /**
     * @return
     */
    public String getSummaryline() {
        if (this.amount>=0) {
            return String.format("%s : RS%.02f : %s ",
            this.timestamp.toString(),this.amount,this.memo);
        }else{
            return String.format("%s : RS(%.02f) : %s ",this.timestamp.toString(),
            this.amount,this.memo);
        }
       
    }



    //
    protected Account getInaccount(){
        return this.inAccount;
    }

}
