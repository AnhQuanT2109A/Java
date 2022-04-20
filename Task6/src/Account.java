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

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
     public int credit(int amount) {
        balance+=amount;
        return balance;
     }
     public int debit(int amount) {
        if(amount<=balance) {
            balance-=amount;
            return balance;
        }else {
            System.out.println("The amount is not enough to withdraw");
        }
        return balance;
     }
     public int tranferTo(Account another, int amount) {
        if(amount<=balance) {
            another.balance+=amount;
        }else {
            System.out.println("The amount is not enough to trasfer");
        }
         return balance;
     }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + "\n" +
                ", name='" + name + "\n" +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Account P1 = new Account("1","Dam Huy Anh Quan");
        System.out.println("ID: " + P1.getId() + ", Name: "+P1.getName());

        Account P2 = new Account("2","Thanh Thao", 20000);

        System.out.println("ID: "+P2.getId() + ", Name: " + P2.getName() + ", Balance: " + P2.getBalance());
        System.out.println("ID: "+P2.getId() + ", Name: " + P2.getName() + ", Balance: " + P2.credit(10000));
        System.out.println("ID: "+P2.getId() + ", Name: " + P2.getName() + ", Balance: " + P2.debit(500));
        P2.tranferTo(P2,123);
        System.out.println("ID: "+P2.getId() + ", Name: " + P2.getName() + ", Balance: " + P2.getBalance());
        System.out.println(P2.toString());
    }
}
