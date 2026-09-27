package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class SupportEngineer extends Entity {

    public SupportEngineer(String id, String name){

        super(id, name, "support engineer");
        System.out.println("const of support engineer");
    }

    public void resolveTickets() {

        System.out.println(getName() + " is resolving support tickets");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in support engineer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in support engineer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in support engineer");
    }
}
