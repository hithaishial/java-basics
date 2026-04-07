package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class NetworkEngineer extends Entity {

    public NetworkEngineer(String id, String name) {
        super(id, name, "NetworkEngineer");
        System.out.println("const of network engineer");
    }

    public void configureNetwork(Entity entity) {
        if (entity != null){
            if (entity instanceof NetworkEngineer) {
                NetworkEngineer ne = (NetworkEngineer) entity;
                ne.displayInfo();
            }
        }
        System.out.println(getName() + " is configuring network devices");
    }

}
