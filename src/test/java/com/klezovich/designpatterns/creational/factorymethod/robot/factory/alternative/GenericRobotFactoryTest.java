package com.klezovich.designpatterns.creational.factorymethod.robot.factory.alternative;

import org.junit.jupiter.api.Test;

class GenericRobotFactoryTest {

    private GenericRobotFactory factory = new GenericRobotFactory();


    //Note that we can create a factory method like this also
    //But then we have a switch in the factory method class
    //And we need to maintain an ENUM
    //Which is not optimal for maintainability
    @Test
    void testCanCreateRobots() {
        var worker = factory.createRobot(RobotType.WORKER);
        worker.attack();

        var battleRobot = factory.createRobot(RobotType.BATTLE);
        battleRobot.attack();
    }
}