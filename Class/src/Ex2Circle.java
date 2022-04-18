public class Ex2Circle {
    private double radius;
    public Ex2Circle() {
        radius = 1;
    }
    public Ex2Circle(double r){
        radius=r;
    }
    public double getAre() {
        return radius*radius*Math.PI;
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Ex2Circle[" + "radius=" + radius + ']';
    }
}
