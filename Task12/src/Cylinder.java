public class Cylinder extends CIrcle {
    private double height;

    public Cylinder() {
        super();
        this.height=1;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }
    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }
    public Cylinder(double height, double radius, String color) {
        super(radius,color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}

