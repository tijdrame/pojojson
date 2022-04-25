package com.example.pojojson.designpatterns.builderpattern;

import com.example.pojojson.designpatterns.builderpattern.model.Robot;

public class HumonoRobotBuilder implements RobotBuilder{

    private Robot robot;

    public HumonoRobotBuilder () {}

    @Override
    public void initBot() {
        this.robot = new Robot();
    }

    @Override
    public void assembleArms() {
        this.robot.setArms("Setting arms");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("Setting legs");
    }

    @Override
    public void assembleWheels() {
        this.robot.setWheels("Setting wheels");
    }

    @Override
    public void assembleHead() {
        this.robot.setHead("Setting head");
    }

    @Override
    public void assembleFireArms() {
        this.robot.setFireArms("Setting firearms");
    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Setting sensorss");
    }

    @Override
    public void assembleDoors() {
        this.robot.setDoors("No Doors required");
    }

    @Override
    public Robot build() {
        return this.robot;
    }
    
    
}
