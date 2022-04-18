public class Product {
    private String name;
    private float price;
    private int qti;
    private int id;
    public Product() {
        name="Quan";
        price=30000;
        qti=3;
        id=4;
    }
    public Product(String nameN, int idI) {
        name = nameN;
        id = idI;
    }
    public Product(String nameN, int idI, float priceP, int qtiQ) {
        name = nameN;
        id = idI;
        price = priceP;
        qti = qtiQ;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public int getQti() {
        return qti;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
