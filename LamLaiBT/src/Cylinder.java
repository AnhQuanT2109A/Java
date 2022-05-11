public class Cylinder extends Circle3 {
    private double height;
    public Cylinder() {
        height = 0;
    }
    public Cylinder(double height, double radius) {
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder: radius = "+getRadius()+", color = "+getColor()+", height = "+height;
    }
    public double getVolume() {
        return Math.PI*getRadius()*getRadius()*height;
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2,4, "blue");
        c1.getVolume();
        System.out.println(c1.getVolume());
    }
}
