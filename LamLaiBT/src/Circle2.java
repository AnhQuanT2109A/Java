public class Circle2 {
    private double radius;

    public Circle2() {
        radius = 1;
    }
    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*(radius*radius);
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[radius = "+ radius + "]";
    }

    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        System.out.println(c1);

        Circle2 c2 = new Circle2(5);
        System.out.println("Area Circle with radius = "+c2.getRadius() + " is "+c2.getArea());

        Circle2 c3 = new Circle2(8);
        System.out.println("Circumference Circle with radius = "+c3.getRadius() + " is "+c3.getCircumference());

    }
}
