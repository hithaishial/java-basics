package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Tester extends Entity {

    public Tester(String id, String name){
        super(id, name, "tester");
        System.out.println("const of tester");
    }

    public void testSoftware(Entity entity) {
        if (entity != null){
            if (entity instanceof Tester) {
                Tester tester = (Tester) entity;
                tester.displayInfo();
            }
        }
        System.out.println(getName() + " is testing software");
    }

}
