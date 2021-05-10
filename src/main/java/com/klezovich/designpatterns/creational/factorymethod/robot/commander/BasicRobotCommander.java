package com.klezovich.designpatterns.creational.factorymethod.robot.commander;

import com.klezovich.designpatterns.creational.factorymethod.robot.factory.RobotFactory;
import com.klezovich.designpatterns.creational.factorymethod.robot.robots.Robot;

import java.util.ArrayList;

public class BasicRobotCommander {

    private final Robot robot;

    public BasicRobotCommander(Robot robot) {
        this.robot = robot;
    }

    void defendBase() {
        robot.attack();
    }
}
