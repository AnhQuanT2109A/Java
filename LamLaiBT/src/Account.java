public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
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
        return amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if(amount<=balance) {
            another.balance+=amount;
            this.balance-=amount;
        }
        else {
            System.out.println("The amount is not enough to transfer");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id= "+id+", name= "+name+", balance= "+balance+"]";
    }

    public static void main(String[] args) {
        Account a1 = new Account("1","Anh Quan",2000);
        System.out.println(a1.toString());

        Account a2 = new Account("2","Van A", 100);
        a2.debit(20);
        System.out.println(a2.toString());

        Account a3 = new Account("3", "Nguyen A", 300);
        a1.transferTo(a3,100);
        System.out.println(a3.toString());
        System.out.println(a1.toString());
    }
}
