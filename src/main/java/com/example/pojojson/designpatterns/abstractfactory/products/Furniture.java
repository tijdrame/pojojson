package com.example.pojojson.designpatterns.abstractfactory.products;

public abstract class Furniture {
    private String waterMark;
    public Furniture(String waterMark) {
        this.waterMark = waterMark;
    }

    public abstract void use();
}
