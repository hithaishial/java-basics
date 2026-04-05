package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class DataEngineer extends Entity {

    public DataEngineer(String id, String name) {
        super(id, name, "data engineer");
        System.out.println("const of data engineer");
    }

    public void buildPipeline() {
        System.out.println(getName() + " is building data pipelines");
    }

}
