package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class SupportEngineer extends Entity {

    public SupportEngineer(String id, String name){

        super(id, name, "support engineer");
        System.out.println("const of support engineer");
    }

    public void resolveTickets(Entity entity) {
        if (entity != null){
            if (entity instanceof SupportEngineer) {
                SupportEngineer se = (SupportEngineer) entity;
                se.displayInfo();
            }
        }
        System.out.println(getName() + " is resolving support tickets");
    }




}
