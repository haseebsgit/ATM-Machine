public class Main {
    public static void main(String[] args) {
        ATM_Machine_System atmMachineSystem = new ATM_Machine_System();
        Customer customer1 = new Customer("Cus-001", "1234", 50000);
        Customer customer2 = new Customer("Cus-002", "2345", 60000);
        Customer customer3 = new Customer("Cus-003", "3456", 70000);
        Customer customer4 = new Customer("Cus-004", "4567", 70000);
        atmMachineSystem.addCustomer(customer1);
        atmMachineSystem.addCustomer(customer2);
        atmMachineSystem.addCustomer(customer3);
        atmMachineSystem.addCustomer(customer4);
        atmMachineSystem.removeCustomer("Cus-003");


        atmMachineSystem.menu();

    }
}