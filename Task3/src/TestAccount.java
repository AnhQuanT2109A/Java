public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account("Group ", "Group@nowhere.com", 'm',"090123456");
        System.out.println(acc);

        System.out.println("Name is: " + acc.getName());

        System.out.println("Gender is: " + acc.getGender());

        System.out.println("Email is: "+ acc.getEmail());

        System.out.println("Phone Number " + acc.getPhoneNumber());
    }
}