package com.ecommerce.runner;

import com.ecommerce.products.Product;
import com.ecommerce.products.Category;
import com.ecommerce.products.Cart;
import com.ecommerce.customers.WishList;
import com.ecommerce.customers.Customer;


public class MainRunner {
    public static void main(String[] args) {
        Product product = new Product();
        product.displayProduct();

        Category category = new Category();
        category.showCategory();

        Cart cart = new Cart();
        cart.updateCart();

        Customer customer = new Customer();
        customer.placeOrder();

        WishList wishlist = new WishList();
        wishlist.viewWishlist();

        
    }
}

