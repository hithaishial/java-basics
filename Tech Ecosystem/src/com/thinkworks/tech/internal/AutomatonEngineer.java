package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class AutomatonEngineer extends Entity {

    public AutomatonEngineer(String id, String name) {
        super(id, name, "AutomationEngineer");
        System.out.println("const of automation engineer");
    }

    public void automateTests() {

        System.out.println(getName() + " is automating test cases");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in automation engineer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in automation engineer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in automation engineer");
    }
}
