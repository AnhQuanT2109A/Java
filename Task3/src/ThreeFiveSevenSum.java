public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        int x = 1;
        int y = 1000;
        int sum=0;
        while (x <= y) {
            if ((x%3==0 || x%5==0 || x%7==0) && !(x%15==0 || x%21==0 || x%35==0 || x%105==0)) {
                sum+=x;
            }
            x++;
        }
        System.out.println(sum);
    }
}
