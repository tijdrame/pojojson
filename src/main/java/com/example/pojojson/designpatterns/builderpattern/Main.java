package com.example.pojojson.designpatterns.builderpattern;

import com.example.pojojson.designpatterns.builderpattern.model.Robot;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    
    public static void main(String[] args) {
        RobotBuilder builder = new HumonoRobotBuilder();
        
        builder.initBot();
        builder.assembleHead();
        builder.assembleArms();
        builder.assembleLegs();
        builder.assembleSensors();

        Robot sofia = builder.build();
        log.info("sofia [{}]", sofia);
    }
}
