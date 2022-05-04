public class TestSP {
    public static void main(String[] args) {
        LoaiSanPham L1 = new LoaiSanPham(1, "Sach");
        System.out.println(L1.toString());

        SanPham SP1 = new SanPham(2, "TV", "TV SAM SUM",50000);
        SP1.setId(4);
        SP1.setPrice(70000);
        System.out.println(SP1.toString());

        SanPham SP2 = new SanPham(4, "Mobile", "Nokia",500);
        SP2.setId(5);
        SP2.setPrice(600);
        System.out.println(SP2.toString());
    }
}
