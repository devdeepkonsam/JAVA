package com.devdeep.banking;

import java.util.Scanner;

public class MainATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Bank theBank = new Bank("State Bank of India");

        //add a user , which also create 
        User ouser = theBank.addUser("Devdeep", "Singha", "1234");

        //add a checking account for our user
        Account newaccout = new Account("Savings", ouser, theBank);
        ouser.addAccount(newaccout);

        Account eAccount = new Account("Current", ouser, theBank);
        ouser.addAccount(eAccount);


        User curUser;
        while (true) {
            //stay in the login prompt until successfull login
            curUser = MainATM.mainMenuPrompt(theBank,input);

            //stay in main menu until user quits
            MainATM.printUserMenu(curUser,input);
        }
    }
    
    /**
     * @param theBank
     * @param input
     * @return
     */
   public static User mainMenuPrompt(Bank theBank, Scanner input) {
        //intiialize
        String userID;
        String pin;
        User authUser;
        //prmopt the user for user id pin until a correct is reached
        do {
            System.out.printf("\n\nWelcome to %s\n\n",theBank.getName());
            System.out.print("Enter User ID:");
            userID = input.nextLine();
            System.out.print("Enter pin:");
            pin = input.nextLine();


            //try to get the user object correcsponding to the ID and PIN Combo
            authUser =theBank.userlogin(userID, pin);
            if (authUser==null) {
                System.out.println("Incorrect User ID/pin combination."+
                                    "Please Try Again.");
            }

        } while (authUser == null); //continue looping until succesfull login

        return authUser;
    }
    public static void printUserMenu(User theUser, Scanner input) {
        //print the summary of the user's accounts
        theUser.printAccountSummary();

        //init
        int choice;
        //user menu
        do {
            System.out.printf("Welcome %s , What would you like to do?",theUser.getName());
            System.out.println("1. Show Account transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.println("Enter Your Choice");
            choice = input.nextInt();

            if (choice<1 || choice >5) {
                System.out.println("Invalid Choice. Please Choose 1-5");
            }

        }while(choice<1 || choice >5);

        //process the choice
        switch (choice) {
            case 1:
            MainATM.showTransaction(theUser,input);        
                break;
            case 2:
            MainATM.withdraw(theUser,input);        
                break;
            case 3:
            MainATM.deposit(theUser,input);        
                break;
            case 4:
            MainATM.transferFund(theUser,input);        
                break;
        }
        //redisplay the menu unitl the user wants to quit
        if (choice != 5) {
            MainATM.printUserMenu(theUser, input);
        }

    }

    /**
     * @param theUser
     * @param input
     */
    public static void showTransaction(User theUser, Scanner input) {
        int theAccount;
         //get account whose transaction history to look at
        do {
           System.out.printf("Enter the account (1-%d) of the account \n "+"whose transaction you want to see",theUser.numAccount());
           theAccount = input.nextInt()-1;
           if (theAccount<0 || theAccount>=theUser.numAccount()) {
            System.out.println("invalid account , please try again");
           }
        } while (theAccount<0 || theAccount>=theUser.numAccount());

        theUser.printTransactionHistory(theAccount);
    }


    /**
     * @param theUser
     * @param input
     */
    public static void transferFund(User theUser, Scanner input) {
        int fromaccount ;
        int toaccount;

        double amount;
        double accountbalance;

        //get the account to transfer from
        do {
            System.out.printf("Enter the number (1-%d) of the account \n"+
            "to tranfer from:",theUser.numAccount());

            fromaccount = input.nextInt()-1;
            if (fromaccount<0 || fromaccount>=theUser.numAccount()) {
                System.out.println("invalid account , please try again");
            }

        } while (fromaccount<0 || fromaccount>=theUser.numAccount());

        accountbalance = theUser.getBalance(fromaccount);

        //get the account to tranfer to
        do {
            System.out.printf("Enter the number (1-%d) of the account \n"+
            "to tranfer to:",theUser.numAccount());

            toaccount = input.nextInt()-1;
            if (toaccount<0 || toaccount>=theUser.numAccount()) {
                System.out.println("invalid account , please try again");
            }

        } while (toaccount<0 || toaccount>=theUser.numAccount());


        //get the amount to transfer 
        do {
            System.out.printf("Enter the ammount to Transfer (max limit RS%.02f) : ",
            accountbalance);
            amount = input.nextDouble();

            if (amount<0) {
                System.out.println("Amount must be greater than 0 ");
            }else if(amount>accountbalance){
                System.out.printf("Amount must not be greater than \n"+"balance ofRS%.02f",
                accountbalance);
            }

        } while (amount<0 || amount>accountbalance);

        //finally do tranfer 
        theUser.addAccountTransaction(fromaccount,-1*amount,String.format("Transfer to account %s ",
        theUser.getAcctUid(toaccount)));

        theUser.addAccountTransaction(toaccount,amount,String.format("transfer from account %s ",
        theUser.getAcctUid(fromaccount)));
    }

    /**
     * @param theUser
     * @param input
     */
    public static void withdraw(User theUser, Scanner input) {
        //init
        int fromaccount ;

        double amount;
        double accountbalance;
        //get the account to transfer from
        do {
            System.out.printf("Enter the number (1-%d) of the account \n"+
            "to tranfer from:",theUser.numAccount());

            fromaccount = input.nextInt()-1;
            if (fromaccount<0 || fromaccount>=theUser.numAccount()) {
                System.out.println("invalid account , please try again");
            }

        } while (fromaccount<0 || fromaccount>=theUser.numAccount());
        accountbalance = theUser.getBalance(fromaccount);

        //get the amount to transfer
        do {
            System.out.printf("Enter the ammount to withdraw (max limit RS%.02f) : ",
            accountbalance);
            amount = input.nextDouble();

            if (amount<0) {
                System.out.println("Amount must be greater than 0 ");
            }else if(amount>accountbalance){
                System.out.printf("Amount must not be greater than \n"+"balance ofRS%.02f",
                accountbalance);
            }

        } while (amount<0 || amount>accountbalance);
        //do the withdraw
        theUser.addAccountTransaction(fromaccount, -1*amount, "Withdrawn");

    }

    /**
     * @param theUser
     * @param input
     */
    public static void deposit(User theUser, Scanner input) {
        int toaccount;
        double amount;
        //to chose the account to deposite the money
        do {
            System.out.printf("Enter the number (1-%d) of the account \n"+
            "to Deposit:", theUser.numAccount());

            toaccount = input.nextInt()-1;
            if (toaccount<0 || toaccount>=theUser.numAccount()) {
                System.out.println("invalid account , please try again");
            }

        } while (toaccount<0 || toaccount>=theUser.numAccount());

        //get the amount to transfer
        do {
            System.out.println("Enter the amount to deposit : ");
            amount = input.nextDouble();

            if (amount<0) {
                System.out.println("Amount must be greater than 0 ");
            }
        } while (amount<0);
        //do the withdraw
        theUser.addAccountTransaction(toaccount, amount, "Deposited");

    }
}
