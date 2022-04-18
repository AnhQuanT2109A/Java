public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString() + "Area "+ r1.getAre() + "Perimeter "+ r1.getPrimeter());
        r1.setWidth(5);
        System.out.println(r1.getWidth());
    }
}
