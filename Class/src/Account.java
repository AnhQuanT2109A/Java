public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String ID, String Name) {
        id = ID;
        name = Name;
    }
    public Account(String ID, String Name, int Balance) {
        id = ID;
        name = Name;
        balance = Balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        if(amount < balance) {
            System.out.printf("Amount: "+amount);
        }
    }

}
