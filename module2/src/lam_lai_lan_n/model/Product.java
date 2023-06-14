package lam_lai_lan_n.model;

import java.util.Objects;

public class Product {
    private String codeProduct;
    private String nameProduct;
    private int quantity;
    private float pince;
    private String description;

    public Product() {
    }

    public Product(String codeProduct, String nameProduct, int quantity, float pince, String description) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.pince = pince;
        this.description = description;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPince() {
        return pince;
    }

    public void setPince(float pince) {
        this.pince = pince;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(codeProduct, product.codeProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", quantity=" + quantity +
                ", pince=" + pince +
                ", description='" + description + '\'' +
                '}';
    }
}
