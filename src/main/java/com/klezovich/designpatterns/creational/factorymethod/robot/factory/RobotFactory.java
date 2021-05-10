package com.klezovich.designpatterns.creational.factorymethod.robot.factory;

import com.klezovich.designpatterns.creational.factorymethod.robot.robots.Robot;

public interface RobotFactory {

    //This is the factory method
    Robot createRobot();
}
