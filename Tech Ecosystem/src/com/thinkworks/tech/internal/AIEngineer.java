package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class AIEngineer extends Entity {

    public AIEngineer(String id, String name){

        super(id, name, "AI Engineer");
        System.out.println("const of ai engineer");
    }

    public void trainModel() {
        System.out.println(getName() + " is training AI models");
    }

}
