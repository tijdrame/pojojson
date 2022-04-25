package com.example.pojojson.designpatterns.designfactory;

import com.example.pojojson.designpatterns.model.Animal;

public interface AnimalFactoryBis {
    Animal createAnimal(String petName, String petType);
}
