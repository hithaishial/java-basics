package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class AutomatonEngineer extends Entity {

    public AutomatonEngineer(String id, String name) {
        super(id, name, "AutomationEngineer");
        System.out.println("const of automation engineer");
    }

    public void automateTests(Entity entity) {
        if (entity != null){
            if (entity instanceof AutomatonEngineer) {
                AutomatonEngineer ae = (AutomatonEngineer) entity;
                ae.displayInfo();
            }
        }
        System.out.println(getName() + " is automating test cases");
    }

}
