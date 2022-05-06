public class Test {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0,0);
        System.out.println("Vi Tri Ban Dau: "+p1);
        p1.moveUp();
        p1.moveUp();
        System.out.println("Vi Tri Sau Khi 2 Lan Move Up: "+p1.toString());
        p1.moveLeft();
        System.out.println("Vi Tri Sau Khi Move Left: "+p1.toString());
    }
}
