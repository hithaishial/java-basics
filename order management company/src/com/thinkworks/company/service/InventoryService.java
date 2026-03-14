package com.thinkworks.company.service;
import com.thinkworks.company.dto.Product;
import com.thinkworks.company.dto.Order;
import com.thinkworks.company.dto.Customer;

public class InventoryService {

     static final String COMPANY_NAME = "Think works";

     public void printProductDetails(Product product){

          System.out.println("product information are provided below:  ");
          System.out.println("product ID: "+ product.getProductId());
          System.out.println("product name: "+ product.getProductName());
          System.out.println("price of the product: "+ product.getPrice());
          System.out.println("quantity: "+ product.getQuantity());
          System.out.println("product category: " + product.getCategory());

          System.out.println("  ");
          System.out.println("  ");

     }
     public void printCustomerDetalis(Customer customer){

          System.out.println("customer information are provided below: ");
          System.out.println("customer ID: " + customer.getCustomerId());
          System.out.println("customer name: "+ customer.getName());
          System.out.println("customer's email: " + customer.getEmail());
          System.out.println("phone number of the customer: " + customer.getPhoneNumber());

          System.out.println("  ");
          System.out.println("  ");
     }
     public void printOrderDetails(Order order){

          System.out.println("name of the customer: "+ order.getCustomer().getName());
          System.out.println("product list: ");
          for (Product product: order.getProducts()){
               System.out.println(product.getProductName());
          }
          System.out.println("total price value: "+ order.calculateOrderValue());
     }
     public double calculateInventoryValue(Product[] products){

          double value =0;
          if(products != null){

               for(Product product: products ){

                    value = value+ (product.getPrice() * product.getQuantity());
               }
          }
          else System.out.println("failed to calculate inventory value");

          return value;
     }
     public void findLowStockProducts(Product[] products){

          if(products != null){

               for(Product product: products){

                    if(product.getQuantity()< 5){
                         System.out.println("product low in stock is: " + product.getProductName());
                    }
                    else System.out.println("product available in stock");
               }
          }

     }
}
