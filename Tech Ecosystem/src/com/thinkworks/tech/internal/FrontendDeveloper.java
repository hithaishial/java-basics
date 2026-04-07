package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class FrontendDeveloper extends Entity {

    public FrontendDeveloper(String id, String name) {
        super(id, name, "FrontendDeveloper");
        System.out.println("const of frontend developer");
    }

    public void buildUI(Entity entity) {
        if (entity != null){
            if (entity instanceof FrontendDeveloper) {
                FrontendDeveloper fd = (FrontendDeveloper) entity;
                fd.displayInfo();
            }
        }
        System.out.println(getName() + " is building frontend UI");
    }


}
