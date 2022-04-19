public class TestEmPloyee {
    public static void main(String[] args) {
        Employee objEmp1 = new Employee(1,"Quan", "Anh", 12);
        System.out.println("Name: "+objEmp1.toString() +objEmp1.AnnualSalary()+"raiseSalary"+objEmp1.raiseSalary(1));

    }
}
