package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class QAEngineer extends Entity {

    public QAEngineer(String id, String name) {
        super(id, name, "QAEngineer");
        System.out.println("const of QA tester");
    }

    public void performQA() {

        System.out.println(getName() + " is performing quality assurance");
    }

    @Override
    public void performRole() {
        super.performRole();
        System.out.println("running performRole in QA engineer");
    }

    @Override
    public void collaborate() {
        super.collaborate();
        System.out.println("running collaborate in QA engineer");
    }

    @Override
    public void reportStatus() {
        super.reportStatus();
        System.out.println("running reportStatus in QA engineer");
    }
}
