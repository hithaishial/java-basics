package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class SystemAdmin extends Entity {

    public SystemAdmin(String id, String name){
        super(id, name, "system admin");
        System.out.println("const of system admin");
    }

    public void maintainServers() {

        System.out.println(getName() + " is maintaining servers");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in system admin");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in system admin");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in system admin");
    }
}


