public class Customer {
    int customerID;
    String customerName;
    String custmerAddress;
    int customerAge;
    void changeCustomerAddress(String address) {
        custmerAddress=address;
    }
    void displayCustomerInformation() {
        System.out.println("Customer Identification Number: "+customerID);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Customer Address "+custmerAddress);
        System.out.println("Customer Age: "+customerAge);
    }
}
