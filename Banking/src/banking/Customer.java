package banking;

/** 
 * Represents a customer of a bank
 * @author Prajul
 */
public class Customer {
    
    String name;

    String address;

    public Customer(String name) {
        this.name=name;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    /* Return name of Customer */
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}
