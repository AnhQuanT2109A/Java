public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(25,07,2003);
        System.out.println(d1.toString());
        Date d2 = new Date();
        d2.setDay(20);
        d2.setMonth(01);
        d2.setYear(2004);
        System.out.println(d2.toString());
    }
}
