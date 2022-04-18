public class Ex1Circle {
    private double radius;
    private String color;
    public Ex1Circle() {
        radius = 1;
        color = "red";
    }
    public Ex1Circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
