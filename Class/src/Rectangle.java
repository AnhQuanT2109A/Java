public class Rectangle {
    private float length;
    private float width;
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getAre() {
        return width*length;
    }
    public double getPrimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
