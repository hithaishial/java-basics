package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class HR extends Entity {

    public HR(String id, String name){

        super(id, name, "HR");
        System.out.println("const of HR");
    }

    public void conductInterview() {

        System.out.println(getName() + " is conducting interviews");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in HR");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in HR");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in HR");
    }
}
