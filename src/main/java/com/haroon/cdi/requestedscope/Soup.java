package com.haroon.cdi.requestedscope;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class Soup {

    private String name = "Soup of the day";

    @PostConstruct
    public void afterCreate() {
        System.out.println("Soup created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
