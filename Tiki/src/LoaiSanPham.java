public class LoaiSanPham {
    private int id;
    private String typeName;

    public LoaiSanPham() {
        this.id = 0;
        this.typeName = " ";
    }
    public LoaiSanPham(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public int getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
