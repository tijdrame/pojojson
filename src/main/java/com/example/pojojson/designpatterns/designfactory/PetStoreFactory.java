package com.example.pojojson.designpatterns.designfactory;

import com.example.pojojson.designpatterns.model.Animal;
import com.example.pojojson.designpatterns.model.Cat;
import com.example.pojojson.designpatterns.model.Dog;

public class PetStoreFactory implements AnimalFactoryBis {

    @Override
    public Animal createAnimal(String petName, String petType) {
        Animal pet;
        if(petType.equalsIgnoreCase("Dog")) {
            pet = new Dog(petName);
        } else if(petType.equalsIgnoreCase("Cat")) {
            pet = new Cat(petName);
        } else {
            throw new IllegalArgumentException(petType + " is not a valid pet category");
        }
        return pet;
    }
    
}
