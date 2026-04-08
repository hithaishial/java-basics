package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class CloudEngineering extends Entity {

   public CloudEngineering(String id, String name) {
       super(id, name, "CloudEngineer");
   }

    public void manageCloud() {

        System.out.println(getName() + " is managing cloud infrastructure");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in cloud engineer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in cloud engineer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in cloud engineer");
    }
}
