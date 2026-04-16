package com.thinkworks.inheritance.internal;

import com.thinkworks.inheritance.external.Delivery;
import com.thinkworks.inheritance.external.Order;
import com.thinkworks.inheritance.external.Tracking;

public class ECommerceApp implements Order, Delivery, Tracking {

    @Override
    public void placeOrder() {
        System.out.println("Order placed");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order delivered");
    }

    @Override
    public void trackOrder() {
        System.out.println("Order tracked");
    }
}
