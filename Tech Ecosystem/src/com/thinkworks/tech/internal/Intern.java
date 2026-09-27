package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Intern extends Entity {

    public Intern(String id, String name) {
        super(id, name, "Intern");
        System.out.println("const of intern");
    }

    public void learnSkills() {

        System.out.println(getName() + " is learning new skills");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in intern");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in intern");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in intern");
    }
}
