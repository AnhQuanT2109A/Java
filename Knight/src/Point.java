public class Point {
    private int x =0;
    private int y =0;
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    public int[] getXY() {
        return new int[] {x,y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(int x, int y) {
        return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
    }
    public double distance(Point another) {
        return Math.sqrt((x-another.x)*(x-another.x) + (y-another.y)*(y-another.y));
    }
    public double distance() {
        return Math.sqrt(x*x - y*y);
    }
}
