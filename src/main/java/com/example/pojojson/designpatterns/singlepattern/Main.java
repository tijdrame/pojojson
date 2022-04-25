package com.example.pojojson.designpatterns.singlepattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.INSTANCE;
        singleton.setValue(1);
        log.info("singleton value [{}]", singleton.getValue());

        MySingleton singleton2 = MySingleton.INSTANCE;
        log.info("singleton2 value [{}]", singleton2.value);

        singleton.setValue(8);

        log.info("singleton value [{}]", singleton.getValue());
        log.info("singleton2 value [{}]", singleton2.value);
    }
}
