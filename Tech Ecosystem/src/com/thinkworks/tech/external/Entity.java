package com.thinkworks.tech.external;

public class Entity {

    private String id;
    private String name;
    private String type;

    public Entity(String id, String name, String type){
        System.out.println("const of entity");
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void displayInfo(){
        System.out.println("superclass entity is created: ");
        System.out.println("entity ID: " + getId());
        System.out.println("entity name: " + getName());
        System.out.println("entity type: " + getType());
    }
}
