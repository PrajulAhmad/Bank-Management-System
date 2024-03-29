package banking;

public class BankAccount
{
    
    //instance vars
    String accountType;

    double balance;

    Customer customer;

    public BankAccount(String accountType, Customer customer) {
        this.accountType =accountType;
        this.customer = customer;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if(amount>this.balance) {
            throw new Exception("Amount is greater than available balance");
        }
        this.balance -= amount;
    }


    public String getAccountInfo() {
        return this.accountType +": "+ this.balance;
    }

    //Return Customer Name and info
    public String getCustomerInfo() {
        return this.customer.getName() +" "+this.customer.getAddress();
    }
}


