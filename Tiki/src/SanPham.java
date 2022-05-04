public class SanPham extends LoaiSanPham {
    private String name;
    private float price;

    public SanPham() {
        this.name = " ";
        this.price = 0;
    }
    public  SanPham(int id, String typeName, String name, float price) {
        super(id, typeName);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " +getId() + ", TypeName: " + getTypeName() +
                ", Name: " + name + ", Price: " + price;
    }
}
