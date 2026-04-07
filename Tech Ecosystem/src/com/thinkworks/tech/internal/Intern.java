package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Intern extends Entity {

    public Intern(String id, String name) {
        super(id, name, "Intern");
        System.out.println("const of intern");
    }

    public void learnSkills(Entity entity) {
        if (entity != null){
            if (entity instanceof Intern) {
                Intern intern = (Intern) entity;
                intern.displayInfo();
            }
        }
        System.out.println(getName() + " is learning new skills");
    }


}
