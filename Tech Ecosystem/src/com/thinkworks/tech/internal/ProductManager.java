package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class ProductManager extends Entity {

    public ProductManager(String id, String name){

        super(id, name, "product manager");
        System.out.println("const of product manager");
    }

    public void defineRoadmap(Entity entity) {
        if (entity != null){
            if (entity instanceof ProductManager) {
                ProductManager pm = (ProductManager) entity;
                pm.displayInfo();
            }
        }
        System.out.println(getName() + " is defining product roadmap");
    }

}


