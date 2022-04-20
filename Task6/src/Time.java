public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int Hour, int Minute, int Second) {
        hour = Hour;
        minute = Minute;
        second = Second;
    }

    public int getHour() {
        if(hour>=0 && hour<=23) {
            return hour;
        }else {
            System.out.println("Wrong Hour");
        }
        return hour;
    }

    public int getMinute() {
        if(minute>=0 && minute<=59) {
            return minute;
        }else {
            System.out.println("Wrong minute");
        }
        return minute;
    }

    public int getSecond() {
        if(second>=0 && second<=59) {
            return second;
        }else {
            System.out.println("Wrong second");
        }
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }


}
