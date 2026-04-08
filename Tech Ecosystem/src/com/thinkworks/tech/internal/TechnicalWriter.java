package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class TechnicalWriter extends Entity {

    public TechnicalWriter(String id, String name) {
        super(id, name, "TechnicalWriter");
        System.out.println("const of technical writer");
    }
    public void writeDocs() {

        System.out.println(getName() + " is writing technical documentation");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in technical writer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in technical writer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in technical writer");
    }

}
