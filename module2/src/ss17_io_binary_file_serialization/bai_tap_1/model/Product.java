package ss17_io_binary_file_serialization.bai_tap_1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String codeProduct;
    private String nameProduct;
    private String pice;
    private String manufacturer;
    private String describe;

    public Product() {

    }

    public Product(String codeProduct, String nameProduct, String pice, String manufacturer, String describe) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.pice = pice;
        this.manufacturer = manufacturer;
        this.describe = describe;
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

    public String getPice() {
        return pice;
    }

    public void setPice(String pice) {
        this.pice = pice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", pice='" + pice + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
