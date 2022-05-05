public class Point {
    private int x, y;
    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    public int getX(){
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
    public int[] getXY(){
        int arr[] = new int[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point = ("  + x + "," + y + ")";
    }

    public double distance(int x, int y){
        return Math.sqrt((x - this.x)* (x - this.x) + (y- this.y)*(y- this.y));
    }
    public double distance(Point another){
        return Math.sqrt((another.x - this.x)* (another.x - this.x) + (another.y- this.y)*(another.y- this.y));
    }
    public double distance(){
        return distance(0,0);
    }
}