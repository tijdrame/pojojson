package com.example.pojojson.designpatterns.abstractfactory;

import com.example.pojojson.designpatterns.abstractfactory.client.Customer;
import com.example.pojojson.designpatterns.abstractfactory.client.RestaurantWithAbstractFactory;
import com.example.pojojson.designpatterns.abstractfactory.factory.DominosChainFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Simulation {
    
    public static void main(String[] args) {
        RestaurantWithAbstractFactory dominosChain = new RestaurantWithAbstractFactory(new DominosChainFactory());
        Customer customer = new Customer(dominosChain);
        customer.visitRestaurant();

    }
}
