package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class SecurityEngineer extends Entity {

    public SecurityEngineer(String id, String name){

        super(id, name, "security engineer");
        System.out.println("const of security engineer");
    }

    public void performAudit() {

        System.out.println(getName() + " is performing security audits");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in security engineer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in security engineer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in security engineer");
    }
}
