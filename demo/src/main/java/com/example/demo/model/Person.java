package com.example.demo.model;

import java.util.UUID;

public class Person {

    private final UUID id;
    private final String name;
    private final int age;

    public Person(UUID id, String name, int age){
        this.id=id;
        this.name= name;
        this.age=age;

    }

    public UUID getId(){
        return id;

    }

    public String getName(){
        return name;
    }

    public int getage(){
        return age;

    }

    
}
