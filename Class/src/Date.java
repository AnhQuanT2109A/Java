public class Date {
    private int day;
    private int month;
    private int year;
    public Date() {
        day = 01;
        month = 01;
        year = 2003;
    }
    public Date(int Day, int Month, int Year) {
        day = Day;
        month = Month;
        year = Year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "" + day + "/" + month + "/" + year ;
    }
}

