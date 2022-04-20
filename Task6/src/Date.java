public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int Day, int Month, int Year) {
        day = Day;
        month = Month;
        year = Year;
    }

    public int getDay() {
        if(day>=1 && day<= 31) {
            return day;
        }else {
            System.out.println("Wrong Day");
        }
        return day;
    }
    public int getMonth() {
        if(month>=1 && month<=12) {
            return month;
        }else  {
            System.out.println("Wrong Month");
        }
        return month;
    }

    public int getYear() {
        if(year>=1900 && year<=9999) {
            return year;
        }else {
            System.out.println("Wrong Year");
        }
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return
                "" + day +
                "/" + month +
                "/" + year
                ;
    }

    public static void main(String[] args) {
        Date D1 = new Date(25, 07, 2003);
        System.out.println(D1.getDay() + D1.getMonth() + D1.getYear());

    }
}

