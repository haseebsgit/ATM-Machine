public class Customer {
    private String customerID;
    private String customerPin;
    private double customerBalance;


    public Customer(String customerID, String customerPin, double customerBalance) {
        this.customerID = customerID;
        this.customerPin = customerPin;
        this.customerBalance = customerBalance;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerPin() {
        return customerPin;
    }

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }
}