package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class SystemAdmin extends Entity {

    public SystemAdmin(String id, String name){
        super(id, name, "system admin");
        System.out.println("const of system admin");
    }

    public void maintainServers(Entity entity) {
        if (entity != null){
            if (entity instanceof SystemAdmin) {
                SystemAdmin sa = (SystemAdmin) entity;
                sa.displayInfo();
            }
        }
        System.out.println(getName() + " is maintaining servers");
    }

}


