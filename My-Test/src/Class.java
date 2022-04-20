public class Class {
    private int Rollno;
    private String Name;
     public Class(int rollno, String name) {
         Rollno = rollno;
         Name = name;
     }




    public static void main(String[] args) {
        Class C1 = new Class(1, "Quan");
        System.out.println(C1.toString());
    }
}
