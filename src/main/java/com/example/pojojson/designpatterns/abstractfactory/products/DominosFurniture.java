package com.example.pojojson.designpatterns.abstractfactory.products;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DominosFurniture extends Furniture {

    public DominosFurniture(String waterMark) {
        super(waterMark);
    }

    @Override
    public void use() {
        log.info("Furniture style furniture");        
    }
    
}
