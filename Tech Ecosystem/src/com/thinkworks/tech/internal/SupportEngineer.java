package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class SupportEngineer extends Entity {

    public SupportEngineer(String id, String name){

        super(id, name, "support engineer");
        System.out.println("const of support engineer");
    }

    public void resolveTickets() {
        System.out.println(getName() + " is resolving support tickets");
    }



}
