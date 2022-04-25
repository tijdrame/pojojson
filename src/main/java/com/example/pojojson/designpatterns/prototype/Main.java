package com.example.pojojson.designpatterns.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Test name");
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototypeRegistry("Original", original);

        ConcretePrototype clone = (ConcretePrototype) registry.getPrototypeCloneFromPrototypeRegistry("Original");
        log.info("Original [{}]", original);
        log.info("Clone [{}]", clone);

        log.info("Original value [{}]", original.getName());
        log.info("Clone value [{}]", clone.getName());
    }
}
