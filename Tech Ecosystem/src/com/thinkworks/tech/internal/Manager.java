package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Manager extends Entity {

    public Manager(String id, String name){
        super(id, name, "manager");
        System.out.println("const of manager");
    }

    public void manageTeam(Entity entity) {
        if (entity != null){
            if (entity instanceof Manager) {
                Manager manager = (Manager) entity;
                manager.displayInfo();
            }
        }
        System.out.println(getName() + " is managing the team");
    }

}
