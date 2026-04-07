package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Consultant extends Entity {

    public  Consultant(String id, String name) {
        super(id, name, "Consultant");
        System.out.println("const of consultant");
    }

    public void adviseClients(Entity entity) {
        if (entity != null){
            if (entity instanceof Consultant) {
                Consultant c = (Consultant) entity;
                c.displayInfo();
            }
        }
        System.out.println(getName() + " is advising clients");
    }


}
