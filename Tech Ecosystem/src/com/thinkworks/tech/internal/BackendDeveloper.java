package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class BackendDeveloper extends Entity {

    public BackendDeveloper(String id, String name) {
        super(id, name, "BackendDeveloper");
        System.out.println("const of backend developer");
    }

    public void buildAPI() {

        System.out.println(getName() + " is building backend APIs");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in backend developer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in backend developer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in backend developer");
    }
}
