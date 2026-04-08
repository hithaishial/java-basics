package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class AIEngineer extends Entity {

    public AIEngineer(String id, String name){

        super(id, name, "AI Engineer");
        System.out.println("const of ai engineer");
    }

    public void trainModel() {

        System.out.println(getName() + " is training AI models");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in AI engineer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in AI engineer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in AI engineer");
    }
}
