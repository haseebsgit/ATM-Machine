import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM_Machine_System {
    private List<Customer> customers;

    public ATM_Machine_System() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(String customerId) {
        Customer pointerToRemove = null;
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(customerId)) {
                pointerToRemove = customer;
            }
        }
        customers.remove(pointerToRemove);
    }

    public void menu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM Machine");
        System.out.println("Please Enter your Customer ID");
        String customerID = scanner.nextLine();
        System.out.println("Please enter your four digit pin");
        String customerPin = scanner.nextLine();

        boolean found = false;

        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(customerID) && customer.getCustomerPin().equals(customerPin)) {
                found = true;
                while (true) {
                    System.out.println("Press 1 for Balance inquiry");
                    System.out.println("Press 2 for cash deposit");
                    System.out.println("Press 3 for cash withdraw");
                    System.out.println("Press 4 for exit");

                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Your balance is : " + customer.getCustomerBalance());
                            break;

                        case 2:
                            System.out.println("Enter the amount you want to deposit");
                            double depositAmount = scanner.nextDouble();
                            customer.setCustomerBalance(depositAmount + customer.getCustomerBalance());
                            System.out.println("Amount deposited successfully ");
                            System.out.println("New balance is : " + customer.getCustomerBalance());
                            break;

                        case 3:
                            System.out.println("Enter the amount you want to withdraw");
                            double withdrawAmount = scanner.nextDouble();
                            if (withdrawAmount <= customer.getCustomerBalance()) {
                                customer.setCustomerBalance(customer.getCustomerBalance() - withdrawAmount);
                                System.out.println("Amount withdrawn ");
                                System.out.println("New balance is :" + customer.getCustomerBalance());

                            } else {
                                System.out.println("Insufficient balance");
                            }
                            break;
                        case 4:
                            System.out.println("Thanks for using ATM machine");
                            return;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Your credentials don't match, please try again");
        }
    }
}