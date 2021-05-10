package com.klezovich.designpatterns.creational.factorymethod.robot.robots;

public class WorkerRobot implements Robot {
    @Override
    public void attack() {
        System.out.println("Worker robot attacks...");
    }
}
