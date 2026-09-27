package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class ProductManager extends Entity {

    public ProductManager(String id, String name){

        super(id, name, "product manager");
        System.out.println("const of product manager");
    }

    public void defineRoadmap() {

        System.out.println(getName() + " is defining product roadmap");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in product manager");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in product manager");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in product manager");
    }
}


