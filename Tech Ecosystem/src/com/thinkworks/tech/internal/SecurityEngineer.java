package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class SecurityEngineer extends Entity {

    public SecurityEngineer(String id, String name){

        super(id, name, "security engineer");
        System.out.println("const of security engineer");
    }

    public void performAudit() {
        System.out.println(getName() + " is performing a security audit");
    }

}
