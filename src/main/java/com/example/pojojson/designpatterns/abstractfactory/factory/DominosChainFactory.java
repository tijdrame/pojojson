package com.example.pojojson.designpatterns.abstractfactory.factory;

import com.example.pojojson.designpatterns.abstractfactory.products.DominosFoodMenu;
import com.example.pojojson.designpatterns.abstractfactory.products.DominosFurniture;
import com.example.pojojson.designpatterns.abstractfactory.products.FoodMenu;
import com.example.pojojson.designpatterns.abstractfactory.products.Furniture;

public class DominosChainFactory implements FoodChainFactory {

    @Override
    public FoodMenu createFoodMenu() {
        return new DominosFoodMenu("Dominos Style Food Menu");
    }

    @Override
    public Furniture creatFurniture() {
        return new DominosFurniture("Dominos Style Furniture");
    }
    
}
