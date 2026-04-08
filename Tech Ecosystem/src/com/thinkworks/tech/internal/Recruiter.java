package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Recruiter extends Entity {

    public Recruiter(String id, String name){

        super(id, name, "recruiter");
        System.out.println("const of recruiter");
    }

    public void hireTalent() {

        System.out.println(getName() + " is hiring new talent");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in recruiter");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in recruiter");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in recruiter");
    }
}


