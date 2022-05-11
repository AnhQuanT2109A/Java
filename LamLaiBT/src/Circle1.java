public class Circle1 {
    private double radius;
    private String color;

    public Circle1(double radius, String color) {
        radius = 1;
        color = "red";
    }
    public Circle1( String color, double r) {
        color = "red";
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    public static void main(String[] args) {
        Circle1 c1 = new Circle1("Green",7);
        System.out.println("Area Circle is "+c1.getArea());
    }
}
