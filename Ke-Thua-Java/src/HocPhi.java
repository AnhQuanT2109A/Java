public class HocPhi extends ThongTinSV {
    private float Tien;

    public HocPhi() {
        super();
        this.Tien = 0;
    }
    public HocPhi(float Tien) {
        super();
        this.Tien = Tien;
    }
    public HocPhi(String Ten, int Tuoi, String DiaChi, float Tien) {
        super(Ten, Tuoi, DiaChi);
        this.Tien = Tien;
    }

    public float getTien() {
        return this.Tien;
    }

    public void setTien(float Tien) {
        this.Tien = Tien;
    }

    @Override
    public String toString() {
        return "Ten: " + this.getTen() +
                "  Tuoi: " + this.getTuoi() +
                " Dia Chi: " + this.getDiaChi() +
                " Tien: " + this.Tien;
    }
}
