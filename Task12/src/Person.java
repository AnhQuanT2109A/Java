public class Person {
    private String name;
    private String address;
    public Person(String n, String ad){
        this.name = n;
        this.address = ad;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "(" + address + ")";
    }
}