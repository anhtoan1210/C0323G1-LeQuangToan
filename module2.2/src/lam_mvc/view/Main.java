package lam_mvc.view;

import lam_mvc.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.menu();
    }
}
