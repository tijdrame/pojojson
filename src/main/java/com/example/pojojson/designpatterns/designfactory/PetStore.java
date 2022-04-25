package com.example.pojojson.designpatterns.designfactory;

import com.example.pojojson.designpatterns.model.Animal;

public class PetStore {
    private AnimalFactoryBis factory;

    public PetStore(AnimalFactoryBis factory) {
        this.factory = factory;
    }
    public static void main(String[] args) {
        //phase 1
        //PetStore petStore = new PetStore();
        PetStore petStore = new PetStore(new PetStoreFactory()); // on peut creer une autre classe qui implemente AnimalFactoryBis et pourra remplacer PetStoreFactory
        Animal pet = petStore.orderPet("Dollar", "dog");
        pet.makeSound();
        pet.moveAround();
    }

    // pour ne pas voir directement l'implementation qui permet de creer un animal
    public Animal orderPet(String petName, String petType){
        return factory.createAnimal(petName, petType);
    }
    /*phase 1 ici on voit l'implementation ce qui n'est pas bien
    public Animal orderPet(String petName, String petType){
        return AnimalFactory.createAnimal(petName, petType);
    }*/
}
