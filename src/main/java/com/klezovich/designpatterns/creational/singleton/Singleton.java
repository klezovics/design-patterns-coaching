package com.klezovich.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    //Hide the constructor from anyone
    private Singleton() {
    }

    public static Singleton getInstance() {

        /*
         * not thread safe
         * More details here https://www.journaldev.com/171/thread-safety-in-java-singleton-classes
        if(instance == null) {
            instance = new Singleton();
        }*/

        return instance;
    }
}
