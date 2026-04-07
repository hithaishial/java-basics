package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class DevOps extends Entity {

    public DevOps(String id, String name){
        super(id, name, "devops");
        System.out.println("const of devops");
    }

    public void deployPipeline(Entity entity) {
        if (entity != null){
            if (entity instanceof DevOps) {
                DevOps devops = (DevOps) entity;
                devops.displayInfo();
            }
        }
        System.out.println(getName() + " is deploying application");
    }


}
