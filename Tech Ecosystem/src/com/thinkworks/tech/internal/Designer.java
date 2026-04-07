package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Designer extends Entity {

    public Designer(String id, String name){

        super(id, name, "designer");
        System.out.println("const of designer");
    }
    public void designUI(Entity entity) {

        if (entity != null){
            if (entity instanceof Designer) {
                Designer designer = (Designer) entity;
                designer.displayInfo();
            }
        }
        System.out.println(getName() + " is designing user interfaces");
    }

}
