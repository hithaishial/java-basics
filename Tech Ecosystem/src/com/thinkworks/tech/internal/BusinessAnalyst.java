package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class BusinessAnalyst extends Entity {

    public BusinessAnalyst(String id, String name){
        super(id, name, "business analyst");
        System.out.println("const of business analyst");
    }

    public void gatherRequirements(Entity entity) {
        if (entity != null){
            if (entity instanceof BusinessAnalyst) {
                BusinessAnalyst ba = (BusinessAnalyst) entity;
                ba.displayInfo();
            }
        }
        System.out.println(getName() + " is gathering business requirements");
    }


}
