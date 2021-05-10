package com.klezovich.designpatterns.creational.factorymethod.robot.factory;

import com.klezovich.designpatterns.creational.factorymethod.robot.robots.BattleRobot;
import com.klezovich.designpatterns.creational.factorymethod.robot.robots.Robot;

public class BattleRobotFactory implements RobotFactory {

    //This is the factory method implementation
    @Override
    public Robot createRobot() {
        return new BattleRobot();
    }
}
