package com.klezovich.designpatterns.creational.factorymethod.robot.commander;

import com.klezovich.designpatterns.creational.factorymethod.robot.factory.RobotFactory;
import com.klezovich.designpatterns.creational.factorymethod.robot.robots.Robot;

import java.util.ArrayList;

public class AdvancedRobotCommander {

    //Basically, note that in the case of a Factory Method
    private final RobotFactory factory;

    public AdvancedRobotCommander(RobotFactory factory) {
        this.factory = factory;
    }

    void defendBase() {
        var robots = new ArrayList<Robot>();
        robots.add(factory.createRobot());
        robots.add(factory.createRobot());
        robots.add(factory.createRobot());

        for(var robot : robots) {
            robot.attack();
        }
    }
}
