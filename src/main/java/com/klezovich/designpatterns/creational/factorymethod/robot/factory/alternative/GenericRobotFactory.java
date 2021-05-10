package com.klezovich.designpatterns.creational.factorymethod.robot.factory.alternative;

import com.klezovich.designpatterns.creational.factorymethod.robot.robots.BattleRobot;
import com.klezovich.designpatterns.creational.factorymethod.robot.robots.Robot;
import com.klezovich.designpatterns.creational.factorymethod.robot.robots.WorkerRobot;

import static com.klezovich.designpatterns.creational.factorymethod.robot.factory.alternative.RobotType.BATTLE;
import static com.klezovich.designpatterns.creational.factorymethod.robot.factory.alternative.RobotType.WORKER;

public class GenericRobotFactory {

    Robot createRobot(RobotType robotType) {
        if(WORKER.equals(robotType)) {
            return new WorkerRobot();
        }

        if(BATTLE.equals(robotType)) {
            return new BattleRobot();
        }

        throw new IllegalArgumentException("Unknown robot type");
    }
}
