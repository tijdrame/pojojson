package com.example.pojojson.designpatterns.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        log.info("Meow Meow..");        
    }

    @Override
    public void moveAround() {
        log.info("the little kitten is moving around!!");                
    }
    
}
