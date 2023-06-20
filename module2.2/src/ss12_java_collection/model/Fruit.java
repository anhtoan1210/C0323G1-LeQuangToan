package ss12_java_collection.model;

public class Fruit implements  Comparable<Fruit>{
    // Xây dựng lớp trái cây có các thuộc tính: Tên trái cây, loại trái cây,
    private String nameFruit;
    private String kindOfFruit;
    private int dateOfManufacture;
    private int expiry;
    private String origin;
    private float price;

    public Fruit() {
    }

    public Fruit(String nameFruit, String kindOfFruit, int dateOfManufacture, int expiry, String origin, float price) {
        this.nameFruit = nameFruit;
        this.kindOfFruit = kindOfFruit;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
        this.origin = origin;
        this.price = price;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getKindOfFruit() {
        return kindOfFruit;
    }

    public void setKindOfFruit(String kindOfFruit) {
        this.kindOfFruit = kindOfFruit;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getExpiry() {
        return expiry;
    }

    public void setExpiry(int expiry) {
        this.expiry = expiry;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "Tên trái cây ='" + nameFruit + '\'' +
                ", Loại trái cây ='" + kindOfFruit + '\'' +
                ", Ngày sản xuất =" + dateOfManufacture +
                ", Hạn sử dụng =" + expiry +
                ", Nguồn gốc ='" + origin + '\'' +
                ", Giá =" + price +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return (int) (this.getPrice()-o.getPrice());
    }
}
