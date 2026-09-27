package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class FullStackDeveloper extends Entity {

    public FullStackDeveloper(String id, String name) {
        super(id, name, "FullStackDeveloper");
        System.out.println("const of fullstack developer");
    }

    public void integrateSystems() {

        System.out.println(getName() + " is integrating frontend and backend");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in fullstack developer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in fullstack developer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in fullstack developer");
    }
}
