package com.ecommerce.products;

public class Cart {

        private void checkItems() {
            System.out.println("Checking cart items...");
        }

        private void updateStock() {
            System.out.println("Updating stock levels...");
        }

        public void updateCart() {
            checkItems();
            updateStock();
            System.out.println("cart updated");
        }

    }
