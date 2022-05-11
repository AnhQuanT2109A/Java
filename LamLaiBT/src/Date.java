public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
       if(day>=1 && day<=31 && month>=1 && month <=12 && year>=1900 && year<=9999) {
           day = day;
           month = month;
           year = year;
       }else {
           day = 1;
           month = 1;
           year = 2003;
       }
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        if(day>=1 && day<=31) {
            day = day;
        }else {
            System.out.println("ERR");
        }
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12) {
            month = month;
        }else {
            System.out.println("ERR");
        }
    }

    public void setYear(int year) {
        if(year>=1900 && year<=9999) {
            year = year;
        }else {
            System.out.println("ERR");
        }
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day+"/"+month+"/"+year;
    }

    public static void main(String[] args) {
        Date d1 = new Date(25, 07, 2003);
        System.out.println(d1.toString());
    }
}
