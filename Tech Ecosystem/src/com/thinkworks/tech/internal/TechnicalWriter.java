package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class TechnicalWriter extends Entity {

    public TechnicalWriter(String id, String name) {
        super(id, name, "TechnicalWriter");
        System.out.println("const of technical writer");
    }
    public void writeDocs(Entity entity) {
        if (entity != null){
            if (entity instanceof TechnicalWriter) {
                TechnicalWriter tw = (TechnicalWriter) entity;
                tw.displayInfo();
            }
        }
        System.out.println(getName() + " is writing technical documentation");
    }


}
