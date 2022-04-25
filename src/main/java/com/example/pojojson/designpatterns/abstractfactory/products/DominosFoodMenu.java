package com.example.pojojson.designpatterns.abstractfactory.products;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DominosFoodMenu extends FoodMenu{

    public DominosFoodMenu(String menuStyle) {
        super(menuStyle);
    }

    @Override
    public void render() {
        log.info("Dominos style menu");
    }
    
}
