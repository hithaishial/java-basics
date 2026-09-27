package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Designer extends Entity {

    public Designer(String id, String name){

        super(id, name, "designer");
        System.out.println("const of designer");
    }
    public void designUI() {

        System.out.println(getName() + " is designing user interfaces");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in designer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in designer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in designer");
    }
}
