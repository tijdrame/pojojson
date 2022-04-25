package com.example.pojojson.designpatterns.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends Animal{
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        log.info("Woof Woof..");        
    }

    @Override
    public void moveAround() {
        log.info("the brave dog is moving around!!");                
    }
}
