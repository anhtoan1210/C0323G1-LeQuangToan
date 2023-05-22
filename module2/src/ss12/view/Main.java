package ss12.view;

import ss12.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}
