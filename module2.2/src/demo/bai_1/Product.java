package demo.bai_1;

public class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        //Trả về 0(2 đối tuong bằng nhau).
        // Trả về số dương(>0)=>Lớn hơn.
        // Trả về số âm (<0)=> Bé hơn.
        if (this.price - product.price > 0) {
            return 1;
        } else if (this.price - product.price < 0) {
            return -1;
        } else
            return 0;
    }
}
