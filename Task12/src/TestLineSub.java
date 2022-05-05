public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        System.out.println(l1);
        LineSub l2 = new LineSub(new Point(5, 6), new Point(7, 8));
        System.out.println(l2);
        //getter, setter
        l1.setBegin(new Point(11, 12));
        l1.setEnd(new Point(13, 14));
        System.out.println(l1);
        System.out.println("begin = " + l1.getBegin());
        System.out.println("end = " + l1.getEnd());

        l1.setBeginX(20);
        l1.setBeginY(21);
        l1.setEndX(22);
        l1.setEndY(23);
        System.out.println(l1);
        System.out.println("begin'x = " + l1.getBeginX());
        System.out.println("begin'y = " + l1.getBeginY());
        System.out.println("end'x = " + l1.getEndX());
        System.out.println("end'y = " + l1.getEndY());
        l1.setBeginXY(30, 31);
        l1.setEndXY(35, 36);
        System.out.println(l1);
        System.out.println("begin'x = " + l1.getBeginXY()[0]);
        System.out.println("begin'y = " + l1.getBeginXY()[1]);
        System.out.println("end'x = " + l1.getEndXY()[0]);
        System.out.println("end'y = " + l1.getEndXY()[1]);
        System.out.printf("length = %.2f%n",l1.getLength());
    }
}