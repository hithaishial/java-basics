package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class DevOps extends Entity {

    public DevOps(String id, String name){
        super(id, name, "devops");
        System.out.println("const of devops");
    }

    public void deployApplication(){
        System.out.println(getName() + " deploys application");
    }
}
