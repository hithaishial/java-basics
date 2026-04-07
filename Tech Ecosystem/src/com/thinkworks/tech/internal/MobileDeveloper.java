package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class MobileDeveloper extends Entity {

    public MobileDeveloper(String id, String name) {
        super(id, name, "MobileDeveloper");
        System.out.println("const of mobile developer");
    }

    public void buildApp(Entity entity) {
        if (entity != null){
            if (entity instanceof MobileDeveloper) {
                MobileDeveloper md = (MobileDeveloper) entity;
                md.displayInfo();
            }
        }
        System.out.println(getName() + " is building mobile apps");
    }


}
