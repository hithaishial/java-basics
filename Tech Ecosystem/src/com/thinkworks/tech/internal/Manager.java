package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Manager extends Entity {

    public Manager(String id, String name){
        super(id, name, "manager");
        System.out.println("const of manager");
    }

    public void manage(){
        System.out.println("manager manages things");
    }
}
