package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class BusinessAnalyst extends Entity {

    public BusinessAnalyst(String id, String name){
        super(id, name, "business analyst");
        System.out.println("const of business analyst");
    }

    public void gatherRequirements() {

        System.out.println(getName() + " is gathering business requirements");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in business analyst");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in business analyst");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in business analyst");
    }
}
