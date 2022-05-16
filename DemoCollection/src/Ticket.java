import java.util.*;

class User {
    private String phim;
    private String rap;
    private int ngay;
    private int thang;
    private int nam;
    private int ghe;
    private int gia;

    public User(String phim, String rap, int ngay, int thang, int nam, int ghe, int gia) {
        this.phim = phim;
        this.rap = rap;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.ghe = ghe;
        this.gia = gia;
    }

    public String getPhim() {
        return phim;
    }

    public String getRap() {
        return rap;
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public int getGhe() {
        return ghe;
    }

    public int getGia() {
        return gia;
    }

    public void setPhim(String phim) {
        this.phim = phim;
    }

    public void setGhe(int ghe) {
        this.ghe = ghe;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    @Override
    public String toString() {
        return "User{" +
                "phim='" + phim + '\'' +
                ", rap='" + rap + '\'' +
                ", ngay=" + ngay +
                ", thang=" + thang +
                ", nam=" + nam +
                ", ghe=" + ghe +
                ", gia=" + gia +
                '}';
    }
}


public class Ticket {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Spider man ","CGV My Dinh", 12,03,2022,12, 18000));
        users.add(new User("Doctor Strange 2 ","CGV Hoan Kiem", 21,06,2022,23, 90000));
        users.add(new User("Avatar 2 ","Galaxy Cinema", 2,7,2022,122, 40000));

        users.forEach(user -> {
            System.out.println("User: Phim: "+ user.getPhim()+", Rap: "+user.getRap()+", Thoi gian: "+user.getNgay()+"/"+user.getThang()+"/"+user.getNam()+", Ghe: "+user.getGhe()+", Gia: "+user.getGia());
        });
        //1.  Tim kiem phim "Avatar 2" o rap nao
        users.forEach(user1 -> {
            if(user1.getPhim().contains("Avatar 2")) {
                System.out.println("\"Avatar 2\" co o rap Galaxy Cinema");
            }
        });
        //2.  Sap xep ten phim
        Collections.sort(users, Comparator.comparing(User::getPhim));
        System.out.println("Sap xep ten phim a -> z: "+ users);


    }
}
