public class TestDrive {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()
                + ", Height = " + cy1.getHeight()
                + ", Color = " + cy1.getColor()
                + ", Base area = " + cy1.getArea());
        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is " + cy2.getRadius()
                + ", Height = " + cy2.getHeight()
                + ", Color = " + cy2.getColor()
                + ", Base area = " + cy2.getArea());
    }
}