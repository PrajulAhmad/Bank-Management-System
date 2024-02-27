package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank account.
 */
public class Bank {
    public static void main(String[] args) {
        
        Bank bank=new Bank();

        bank.run();
    }



    public void run(){
        System.out.println("Welcome to the Bank! \nWhat is your name?");
        Scanner scanner=new Scanner(System.in);

        String name = scanner.next();

        System.out.println("Hello"+ name +"! We are creating checking and savings account for you");
        Customer customer = new Customer(name);

        System.out.println("What is your address!");
        String address= scanner.next();

        customer.setAddress(address);

        //creating checking account
        BankAccount checkingAccount = new BankAccount("checking", customer);
        //crreating saving account
        BankAccount savingAccount   = new BankAccount("saving", customer);

        //gets and print customer infi
        System.out.println();
        System.out.println("Customer Info: ");
        System.out.println(checkingAccount.getCustomerInfo());

        System.out.println("Checking account");
        System.out.println(checkingAccount.getAccountInfo());
    
        System.out.println("Savings account");
        System.out.println(savingAccount.getAccountInfo());
    
        //into checking
        System.out.println();
        System.out.println("Amount to deposit into your checking account?");
        double amount = scanner.nextDouble();
        checkingAccount.deposit(amount);
            

        System.out.println();
        System.out.println("Amount to deposit into your checking account?");
        amount = scanner.nextDouble();
        savingAccount.deposit(amount);

        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingAccount.getAccountInfo());
            
        
        System.out.println();
        System.out.println("Amount to withdraw from your checking account?");
        amount = scanner.nextDouble();
        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());

        }//withdraw from checking


        System.out.println();
        System.out.println("Amount to withdraw from your savings account?");
        amount = scanner.nextDouble();
        try {
            savingAccount.withdraw(amount);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            
        }//withdraw from checking

        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingAccount.getAccountInfo());
        
        scanner.close();

    }
}
