package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Manager extends Entity {

    public Manager(String id, String name){
        super(id, name, "manager");
        System.out.println("const of manager");
    }

    public void manageTeam() {
        System.out.println(getName() + " is managing the team");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in manager");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in manager");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in manager");
    }

}
