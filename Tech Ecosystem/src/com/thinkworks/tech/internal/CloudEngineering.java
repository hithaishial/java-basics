package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class CloudEngineering extends Entity {

   public CloudEngineering(String id, String name) {
       super(id, name, "CloudEngineer");
   }

    public void manageCloud(Entity entity) {
        if (entity != null){
            if (entity instanceof CloudEngineering) {
                CloudEngineering ce = (CloudEngineering) entity;
                ce.displayInfo();
            }
        }
        System.out.println(getName() + " is managing cloud infrastructure");
    }


}
