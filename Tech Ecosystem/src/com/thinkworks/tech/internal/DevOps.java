package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class DevOps extends Entity {

    public DevOps(String id, String name){
        super(id, name, "devops");
        System.out.println("const of devops");
    }

    public void deployPipeline() {

        System.out.println(getName() + " is deploying application");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in devops");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in devops");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in devops");
    }
}
