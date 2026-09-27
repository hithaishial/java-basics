package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class DataEngineer extends Entity {

    public DataEngineer(String id, String name) {
        super(id, name, "data engineer");
        System.out.println("const of data engineer");
    }

    public void buildDataPipeline() {

        System.out.println(getName() + " is building data pipelines");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in data engineer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in data engineer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in data engineer");
    }
}


