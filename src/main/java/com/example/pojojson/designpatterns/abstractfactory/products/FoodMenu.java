package com.example.pojojson.designpatterns.abstractfactory.products;

import lombok.Getter;

@Getter
public abstract class FoodMenu {

    private String menuStyle;

    public FoodMenu(String menuStyle) {
        this.menuStyle = menuStyle;
    }
    
    public abstract void render();
}