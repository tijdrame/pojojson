package com.example.pojojson.designpatterns.builderpattern;

import com.example.pojojson.designpatterns.builderpattern.model.Robot;

public class RCCCarBotBuilder implements RobotBuilder{

    private Robot robot;

    public RCCCarBotBuilder () {
        
    }

    @Override
    public void initBot() {
        this.robot = new Robot();
    }

    @Override
    public void assembleArms() {
        this.robot.setArms("No arms required");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("No legs required");
    }

    @Override
    public void assembleWheels() {
        this.robot.setWheels("Setting wheels");
    }

    @Override
    public void assembleHead() {
        this.robot.setHead("No Head required");
    }

    @Override
    public void assembleFireArms() {
        this.robot.setFireArms("Setting firearms");
    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Setting sensors");
    }

    @Override
    public void assembleDoors() {
        this.robot.setDoors("Setting Doors ");
    }

    @Override
    public Robot build() {
        return this.robot;
    }
    
}
