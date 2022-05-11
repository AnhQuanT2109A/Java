public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary*12;
    }
    public String getName() {
        return firstName +" "+ lastName;
    }
    public int raiseSalary(int percent) {
        return salary+=salary*percent;
    }

    @Override
    public String toString() {
        return "Employee[id="+id+", name="+ firstName +" "+ lastName+", salary="+salary+"]";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Anh","Quan",70000);
        System.out.println(e1.toString());

        Employee e2 = new Employee(2,"Nguyen", "Anh", 30000);
        e2.raiseSalary(4);
        System.out.println("Raise Salary:: " + e2.getSalary());
    }
}
