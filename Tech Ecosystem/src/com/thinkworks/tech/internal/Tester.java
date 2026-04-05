package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Tester extends Entity {

    public Tester(String id, String name){
        super(id, name, "tester");
        System.out.println("const of tester");
    }

    public void testSoftware(){
        System.out.println(getName() + " is testing software");
    }
}
