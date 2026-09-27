package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class NetworkEngineer extends Entity {

    public NetworkEngineer(String id, String name) {
        super(id, name, "NetworkEngineer");
        System.out.println("const of network engineer");
    }

    public void configureNetwork() {

        System.out.println(getName() + " is configuring network devices");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in network engineer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in network engineer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in network engineer");
    }
}
