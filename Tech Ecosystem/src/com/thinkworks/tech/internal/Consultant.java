package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Consultant extends Entity {

    public  Consultant(String id, String name) {
        super(id, name, "Consultant");
        System.out.println("const of consultant");
    }

    public void adviseClients() {

        System.out.println(getName() + " is advising clients");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in consultant");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in consultant");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in consultant");
    }
}
