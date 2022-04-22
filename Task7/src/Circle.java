
import java.awt.*;

public class Circle {
    private Point center;
    private double radius;
     public Circle() {
         this.center = new Point();
         this.radius = 1.0;
     }
    public Circle(int xCenter, int yCenter, double radius) {
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public Point getCenter() {
        return this.center;
    }
    public void setCenter (Point center) {
        this.center = center;
    }
    public double getCenterx() {
        return center.getX();
    }
    public void setCenterx(int x) {
        center.setX(x);
    }
    public double getCentery() {
        return center.getY();
    }
    public void setCenterY(int y) {
        center.setY(y);
    }
    public int[] getCenterXY() {
        return center.getXY();
    }
    public void setCenterXY(int x, int y) {
         center.setXY(x,y);
    }
    public String toString() {
        return "Circle[center=" + center + ",radius=" + radius + "]";
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }
    public double distance(Circle another) {
        return center.distance(another.center);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(1, 2, 3.3);
        System.out.println(c2);
        Circle c3 = new Circle(new Point(4, 5), 6.6);
        System.out.println(c3);

        c1.setCenter(new Point(11, 12));
        c1.setRadius (13.3);
        System.out.println(c1);
        System.out.println("center is: " + c1.getCenter());
        System.out.println("radius is: " + c1.getRadius());

        c1.setCenterx(21);
        c1.setCenterY(22);
        System.out.println(c1);
        System.out.println("center's x is: " + c1.getCenterx());
        System.out.println("center's y is: " + c1.getCentery());
        c1.setCenterXY(31, 32);
        System.out.println(c1);
        System.out.println("center's x is: " + c1.getCenterXY()[0]);
        System.out.println("center's y is: " + c1.getCenterXY()[1]);

        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
        System.out.printf("distance is: %.2f%n", c1.distance(c2));
        System.out.printf("distance is: %.2f%n", c2.distance(c1));
    }
    }
