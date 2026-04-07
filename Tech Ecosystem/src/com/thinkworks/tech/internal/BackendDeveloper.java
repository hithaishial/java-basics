package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class BackendDeveloper extends Entity {

    public BackendDeveloper(String id, String name) {
        super(id, name, "BackendDeveloper");
        System.out.println("const of backend developer");
    }

    public void buildAPI(Entity entity) {
        if (entity != null){
            if (entity instanceof BackendDeveloper) {
                BackendDeveloper bd = (BackendDeveloper) entity;
                bd.displayInfo();
            }
        }
        System.out.println(getName() + " is building backend APIs");
    }


}
