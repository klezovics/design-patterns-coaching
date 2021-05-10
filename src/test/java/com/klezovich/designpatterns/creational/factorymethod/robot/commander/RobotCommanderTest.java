package com.klezovich.designpatterns.creational.factorymethod.robot.commander;

import com.klezovich.designpatterns.creational.factorymethod.robot.factory.BattleRobotFactory;
import com.klezovich.designpatterns.creational.factorymethod.robot.factory.WorkerRobotFactory;
import org.junit.jupiter.api.Test;

class RobotCommanderTest {

    @Test
    void testCanDefendeBaseWithWorkerRobots() {
        var factory = new WorkerRobotFactory();
        var commander = new AdvancedRobotCommander(factory);

        commander.defendBase();
    }


    @Test
    void testCanDefendBaseWithBattleRobots() {
        var factory = new BattleRobotFactory();
        var commander = new AdvancedRobotCommander(factory);

        commander.defendBase();
    }
}