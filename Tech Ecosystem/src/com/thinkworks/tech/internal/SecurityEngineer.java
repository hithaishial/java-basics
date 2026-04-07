package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class SecurityEngineer extends Entity {

    public SecurityEngineer(String id, String name){

        super(id, name, "security engineer");
        System.out.println("const of security engineer");
    }

    public void performAudit(Entity entity) {
        if (entity != null){
            if (entity instanceof SecurityEngineer) {
                SecurityEngineer se = (SecurityEngineer) entity;
                se.displayInfo();
            }
        }
        System.out.println(getName() + " is performing security audits");
    }


}
