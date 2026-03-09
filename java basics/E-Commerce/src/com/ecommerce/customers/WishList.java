package com.ecommerce.customers;

public class WishList {

    private void addWishlistItem() {
        System.out.println("items added to wishlist");
    }

    private void checkWishlistItems() {
        System.out.println("items checked");
    }

    public void viewWishlist() {
        addWishlistItem();
        checkWishlistItems();
        System.out.println("Wishlist viewed");
    }

}
