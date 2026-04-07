package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class FullStackDeveloper extends Entity {

    public FullStackDeveloper(String id, String name) {
        super(id, name, "FullStackDeveloper");
        System.out.println("const of fullstack developer");
    }

    public void integrateSystems(Entity entity) {
        if (entity != null){
            if (entity instanceof FullStackDeveloper) {
                FullStackDeveloper fsd = (FullStackDeveloper) entity;
                fsd.displayInfo();
            }
        }
        System.out.println(getName() + " is integrating frontend and backend");
    }


}
