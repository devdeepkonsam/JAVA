package com.devdeep.banking;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;

    private ArrayList<User> users;

    private ArrayList<Account>  account;

    
    /**
     * @param name
     */
    public Bank(String name) {
        this.name = name;
        this.users = new ArrayList<User>();
        this.account = new ArrayList<Account>();
    }

    /** Generate a new universally unique ID for A user
     * @return the uuid for user
     */
    public String getNewUserUUID() {

        //Create a unique uid for the user 
        String uuid = "";
        Random rng = new Random();
        int len = 6;
        boolean nonUnique;
        
        //continue  looping until we get a new ID
        do {
            for (int i = 0; i < len; i++) {
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
            //check to make its unique
            nonUnique = false;
            for (User u : this.users) {
                if (uuid.compareTo(u.getUUID())==0) {
                    nonUnique = true;
                    break;
                }
            }
            
        } while (nonUnique);

        return uuid;
    
    }

    /**
     * @return Account uid
     */
    public String getAccountUID() {
       //Create a unique uid for the user 
       String uid = "";
       Random rng = new Random();
       int len = 10;
       boolean nonUnique;
       
       //continue  looping until we get a new ID
       do {
           for (int i = 0; i < len; i++) {
               uid += ((Integer)rng.nextInt(10)).toString();
           }
           //check to make its unique
           nonUnique = false;
           for (Account acc : this.account) {
               if (uid.compareTo(acc.getUID())==0) {
                   nonUnique = true;
                   break;
               }
           }
           
       } while (nonUnique);

       return uid;
    }

    
    /**
     * @param firstname
     * @param lastname
     * @param pin
     * @return the new user objects
     */
    public User addUser(String firstname , String lastname , String pin){
        //create a new user object and add it to list
        User newUser = new User(firstname, lastname, pin, this);
        this.users.add(newUser);

        //create a saving account 

        // Account newAccount = new Account("Saving", newUser, this);
        // newUser.addAccount(newAccount);
        // this.account.add(newAccount);

        return newUser;
    }

    /**
     * @param userID
     * @param pin
     * @return
     */
    public User userlogin(String userID , String pin){

        //search through the list of user
        for (User u : this.users) {
            //check user ID is correct
            if (u.getUUID().compareTo(userID)==0 && u.validatePin(pin)){
                return u;
            }
        }
        //if not found 
        return null;
    }

    public Object getName() {
        return this.name;
    }
}
