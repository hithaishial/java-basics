package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Recruiter extends Entity {

    public Recruiter(String id, String name){

        super(id, name, "recruiter");
        System.out.println("const of recruiter");
    }

    public void hireTalent(Entity entity) {
        if (entity != null){
            if (entity instanceof Recruiter) {
                Recruiter r = (Recruiter) entity;
                r.displayInfo();
            }
        }
        System.out.println(getName() + " is hiring new talent");
    }

}


