package com.klezovich.designpatterns.creational.factorymethod.robot.robots;

public class BattleRobot implements Robot {
    @Override
    public void attack() {
        System.out.println("Battle robot attacks...");
    }
}
