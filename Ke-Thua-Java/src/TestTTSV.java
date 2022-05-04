public class TestTTSV {
    public static void main(String[] args) {
        ThongTinSV T1 = new ThongTinSV("Anh Quan", 19, "Hung Yen");
        System.out.println(T1.toString());

        ThongTinSV T2 = new HocPhi(20000);
        System.out.println(T2);

        HocPhi H1 = new HocPhi("Thanh Thao", 18, "Quang Ninh", 41000);
        H1.setTen("A");
        H1.setTuoi(20);
        H1.setDiaChi("Ha Noi");
        H1.setTien(112);
        System.out.println(H1);
    }
}
