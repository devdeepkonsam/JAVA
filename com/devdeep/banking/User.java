package com.devdeep.banking;

import java.util.ArrayList;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    //Firstname of the user
    private String firstname;

    ///Lastname of the user
    private String lastname;

    //unique universal id
    private String uuid;

    //hash of user's oin
    private byte pinHash[];

    //list of account for this user
    private  ArrayList<Account> accounts;




    //constructor for thr User class
    /**
     * @param firstname the users first name 
     * @param lastname the user last name
     * @param pin the users account pin number
     * @param thebank the bank object that the user is a client of
     */
    public User (String firstname , String lastname , String pin, Bank thebank){
        //set users name
        this.firstname = firstname;
        this.lastname = lastname;

        //store thr pins MD5 hash , rather than original vlaue for security
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            
            System.err.println("Error,Caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }
        //get a new , unique universal Uid for the user
        this.uuid = thebank.getNewUserUUID();

        // create empty list of account 
        this.accounts = new ArrayList<Account>();
        System.out.printf("New user %s %s with ID %s created.\n",firstname,lastname,this.uuid);
    }




    /**
     * @param account THE ACCOUNT TO ADD
     */
    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    //get UUID 
    public String getUUID() {
        return this.uuid;
    }




    public boolean validatePin(String pin) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(pin.getBytes()),this.pinHash );
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error,Caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }
        return false;
    }




    public String getName() {
        return this.firstname+this.lastname;
    }




    public void printAccountSummary() {
        System.out.printf("\n\n%s's  Account summary \n",this.firstname);
        for (int i = 0; i < this.accounts.size(); i++) {
            System.out.printf("%d)%s\n",i+1,this.accounts.get(i).getSummaryline());
        }
    }




    public int numAccount() {
        return this.accounts.size();
    }

    public void printTransactionHistory(int acctIndex) {
        this.accounts.get(acctIndex).printTransaction();
    }




    public double getBalance(int fromaccount) {
        return this.accounts.get(fromaccount).getBalance();
    }




    /**
     * @param toaccount
     * @return
     */
    public String getAcctUid(int toaccount) {
        return this.accounts.get(toaccount).getUID();
    }




    public void addAccountTransaction(int fromaccount, double amount, String memo) {
        this.accounts.get(fromaccount).addTransaction(amount,memo);
    }


}
