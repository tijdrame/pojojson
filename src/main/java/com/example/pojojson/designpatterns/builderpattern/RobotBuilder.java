package com.example.pojojson.designpatterns.builderpattern;

import com.example.pojojson.designpatterns.builderpattern.model.Robot;

public interface RobotBuilder {
    
    void initBot();

    void assembleArms();

    void assembleLegs();

    void assembleWheels();

    void assembleHead();

    void assembleFireArms();
    
    void assembleSensors();

    void assembleDoors();

    Robot build();
}
