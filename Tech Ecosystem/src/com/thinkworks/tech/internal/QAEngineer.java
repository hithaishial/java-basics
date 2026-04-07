package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class QAEngineer extends Entity {

    public QAEngineer(String id, String name) {
        super(id, name, "QAEngineer");
        System.out.println("const of QA tester");
    }

    public void performQA(Entity entity) {
        if (entity != null){
            if (entity instanceof QAEngineer) {
                QAEngineer qa = (QAEngineer) entity;
                qa.displayInfo();
            }
        }
        System.out.println(getName() + " is performing quality assurance");
    }



}
