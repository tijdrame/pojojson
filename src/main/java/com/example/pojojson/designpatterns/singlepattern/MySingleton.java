package com.example.pojojson.designpatterns.singlepattern;

//preferer utiliser enum au lieu de classe avec const privé car pas thread safe
public enum MySingleton {
    INSTANCE;
    int value;
    // on peut avoir d'autre value d'un autre type
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
