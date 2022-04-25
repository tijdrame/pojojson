package com.example.pojojson.designpatterns.abstractfactory.client;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Customer {
    private RestaurantWithAbstractFactory restaurant;

    public void visitRestaurant() {
        this.restaurant.renderShop();
        this.restaurant.getMenu().render();
        this.restaurant.getFurniture().use();
    }
}
