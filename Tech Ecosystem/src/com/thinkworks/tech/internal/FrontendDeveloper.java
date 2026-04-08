package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class FrontendDeveloper extends Entity {

    public FrontendDeveloper(String id, String name) {
        super(id, name, "FrontendDeveloper");
        System.out.println("const of frontend developer");
    }

    public void buildUI() {

        System.out.println(getName() + " is building frontend UI");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in frontend developer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in frontend developer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in frontend developer");
    }
}
