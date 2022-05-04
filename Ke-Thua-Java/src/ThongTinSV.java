public class ThongTinSV {
    private String Ten;
    private int Tuoi;
    private String DiaChi;

    public ThongTinSV() {
        this.Ten = " ";
        this.Tuoi = 0;
        this.DiaChi = " ";
    }

    public ThongTinSV(String Ten, int Tuoi, String DiaChi) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
    }

    public String getTen() {
        return this.Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return this.Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return this.DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    @Override
    public String toString() {
        return "Ten : " +Ten
                + " Tuoi : " + Tuoi
                + " Dia Chi: " + DiaChi;
    }
}
