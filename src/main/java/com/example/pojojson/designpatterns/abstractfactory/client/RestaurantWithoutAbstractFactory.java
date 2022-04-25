package com.example.pojojson.designpatterns.abstractfactory.client;

import com.example.pojojson.designpatterns.abstractfactory.products.DominosFoodMenu;
import com.example.pojojson.designpatterns.abstractfactory.products.DominosFurniture;
import com.example.pojojson.designpatterns.abstractfactory.products.FoodMenu;
import com.example.pojojson.designpatterns.abstractfactory.products.Furniture;

import lombok.Getter;

@Getter
public class RestaurantWithoutAbstractFactory {
    private FoodMenu menu;
    private Furniture furniture;

    public RestaurantWithoutAbstractFactory(String foodChainType){
        if(foodChainType.equalsIgnoreCase("Dominos")){
            this.menu = new DominosFoodMenu("Dominos Menu Style");
            this.furniture = new DominosFurniture("Dominos Furniture");
        }else if(foodChainType.equalsIgnoreCase("KFC")){
            this.menu = new DominosFoodMenu("KFC Menu Style");
            this.furniture = new DominosFurniture("KFC Furniture");
        } else {
            throw new IllegalArgumentException("Invalid chain type");
        }
    }

    public void renderShop() {
        this.menu.render();
        this.furniture.use();
    }
}
