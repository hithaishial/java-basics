package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class HR extends Entity {

    public HR(String id, String name){

        super(id, name, "HR");
        System.out.println("const of HR");
    }

    public void conductInterview(Entity entity) {
        if (entity != null){
            if (entity instanceof HR) {
                HR hr = (HR) entity;
                hr.displayInfo();
            }
        }
        System.out.println(getName() + " is conducting interviews");
    }


}
