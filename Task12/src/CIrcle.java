public class CIrcle {
    private double radius = 1;
    private String color;

    public CIrcle() {
        this.radius = radius;
        this.color = "red";
        System.out.println("Construced a Circle with Circle(radius)");
    }
    public CIrcle(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Construced a Circle(radius)");
    }
    public CIrcle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Construced a Circle with Circle(radius, color)");
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CIrcle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
