package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Tester extends Entity {

    public Tester(String id, String name){
        super(id, name, "tester");
        System.out.println("const of tester");
    }

    public void testSoftware() {

        System.out.println(getName() + " is testing software");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in tester");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in tester");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in tester");
    }
}
