package com.example.pojojson.designpatterns.abstractfactory.factory;

import com.example.pojojson.designpatterns.abstractfactory.products.FoodMenu;
import com.example.pojojson.designpatterns.abstractfactory.products.Furniture;

public interface FoodChainFactory {
    FoodMenu createFoodMenu();
    Furniture creatFurniture();
}
