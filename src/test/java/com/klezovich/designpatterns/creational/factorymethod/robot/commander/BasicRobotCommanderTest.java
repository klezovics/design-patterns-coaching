package com.klezovich.designpatterns.creational.factorymethod.robot.commander;

import com.klezovich.designpatterns.creational.factorymethod.robot.robots.BattleRobot;
import com.klezovich.designpatterns.creational.factorymethod.robot.robots.WorkerRobot;
import org.junit.jupiter.api.Test;

class BasicRobotCommanderTest {

    @Test
    void testCanDefendeBaseWithWorkerRobots() {
        var commander = new BasicRobotCommander(new WorkerRobot());

        commander.defendBase();
    }


    @Test
    void testCanDefendBaseWithBattleRobots() {
        var commander = new BasicRobotCommander(new BattleRobot());

        commander.defendBase();
    }
}