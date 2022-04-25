package com.example.pojojson.designpatterns.prototype;

import lombok.Getter;

@Getter
public class ConcretePrototype implements Prototype {
    
    private String name;

    public ConcretePrototype(String name){
        this.name = name;
    }

    public ConcretePrototype(ConcretePrototype prototype){
        this.name = prototype.name;
    }

    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(this);
    }
}
