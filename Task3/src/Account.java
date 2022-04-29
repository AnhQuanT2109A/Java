public class Account {
    private String name;
    private String email;
    private char gender;
    private  String phoneNumber;
    public Account (String name, String email, char gender, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phoneNumber=phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + ";" +"Gender" +  gender + ";" + " Email: " +  email + ";"+ "Phone Number: " + phoneNumber;

    }
}