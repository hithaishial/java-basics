package com.ecommerce.products;

public class Category {

    private void listCategoryName() {
        System.out.println("category name is listed");
    }

    private void checkCategoryItems() {
        System.out.println("Checking items under category");
    }

    public void showCategory() {
        listCategoryName();
        checkCategoryItems();
        System.out.println("Category displayed");
    }

}
