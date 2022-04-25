package com.example.pojojson.designpatterns.abstractfactory.client;

import com.example.pojojson.designpatterns.abstractfactory.factory.FoodChainFactory;
import com.example.pojojson.designpatterns.abstractfactory.products.FoodMenu;
import com.example.pojojson.designpatterns.abstractfactory.products.Furniture;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RestaurantWithAbstractFactory {
    private FoodMenu menu;
    private Furniture furniture;

    public RestaurantWithAbstractFactory(FoodChainFactory foodChainFactory){
        this.menu = foodChainFactory.createFoodMenu();
        this.furniture = foodChainFactory.creatFurniture();
    }

    public void renderShop() {
        this.menu.render();
        this.furniture.use();
    }
}
