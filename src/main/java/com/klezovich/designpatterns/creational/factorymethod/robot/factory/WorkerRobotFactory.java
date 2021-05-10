package com.klezovich.designpatterns.creational.factorymethod.robot.factory;

import com.klezovich.designpatterns.creational.factorymethod.robot.robots.Robot;
import com.klezovich.designpatterns.creational.factorymethod.robot.robots.WorkerRobot;

public class WorkerRobotFactory implements RobotFactory {

    //This is the factory method implementation
    @Override
    public Robot createRobot() {
        return new WorkerRobot();
    }
}
