import java.awt.*;
import java.util.Arrays;

public class Line {
    Point begin, end;
    public Line(int x1, int yi, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    public Line (Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Point getBegin() {
        return begin;
    }
        public Point getEnd() {
            return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
        public void setEnd (Point end) {
            this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int setBeginX(int x) {
        return begin.getY();
    }
    public void getBeginY(int y) {
        begin.setY(y);
    }
    public int[] getBeginXY() {
        return begin.getXY();
    }
    public void setBeginXY (int x, int y) {
        begin.setXY(x, y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }
    public double getLength() {
        return begin.distance(end);
    }

    public static void main(String[] args) {
        Line I1 = new Line(1, 2, 3, 4);
        System.out.println(I1);
        Line I2 = new Line(new Point(5,6), new Point(7,8));
        System.out.println(I2);

        I1.setBegin(new Point(11, 12));
        I1.setEnd(new Point(13, 14));
        System.out.println(I1);
        System.out.println("begin is: " + I1.getBegin());
        System.out.println("end is: " + I1.getEnd());

        I1.setBeginX(21);
        I1.setBeginy(22);
        I1.setEndX(23);
        I1.setEndy (24);
        System.out.println(I1);
        System.out.println("begin's x is: " + I1.getBeginX());
        System.out.println("begin's y is: " + I1.getBegin());
        System.out.println("end's x is: " + I1.getEndX());
        System.out.println("End's y is: " + I1.getEndY());

        I1.setBeginXY(31,32);
        I1.setEndXY(33,34);
        System.out.println(I1);
        System.out.println(I1);
        System.out.println("begin's x and y are: " + Arrays.toString(I1.getBeginXY()));
        System.out.println("end's x and y are: " + Arrays.toString(I1.getEndXY()));

//        System.out.println("length is: %.2f%n", I1.getLength());
    }

    }
