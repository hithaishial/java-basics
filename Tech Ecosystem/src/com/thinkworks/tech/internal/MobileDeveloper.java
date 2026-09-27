package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class MobileDeveloper extends Entity {

    public MobileDeveloper(String id, String name) {
        super(id, name, "MobileDeveloper");
        System.out.println("const of mobile developer");
    }

    public void buildApp() {

        System.out.println(getName() + " is building mobile apps");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in mobile developer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in mobile developer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in mobile developer");
    }
}
