package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Developer extends Entity {

    public Developer(String id, String name){
        super(id, name, "developer");
        System.out.println("const of developer");
    }

    public void writeCode(Entity entity) {

        if (entity instanceof Developer){

            Developer developer = (Developer) entity;
            developer.
        }
        System.out.println(getName() + " is writing code");
    }

}
