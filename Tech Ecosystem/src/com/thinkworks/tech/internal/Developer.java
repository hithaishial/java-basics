package com.thinkworks.tech.internal;

import com.thinkworks.tech.external.Entity;

public class Developer extends Entity {

    public Developer(String id, String name){
        super(id, name, "developer");
        System.out.println("const of developer");
    }

    public void writeCode() {

        System.out.println("developer writes code");
    }
       public void displaycode(Entity entity){

           if (entity != null){
               if (entity instanceof Developer) {

                   Developer developer = (Developer) entity;
                   developer.writeCode();
               }
           }
           System.out.println(getName() + " is writing code");
       }

}
