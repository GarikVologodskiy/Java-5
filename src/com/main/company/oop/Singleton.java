package com.main.company.oop;/* *Double check Locked */

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){
    }

    //private synchronized static Singleton getInstance() {
    private  static Singleton getInstance() {
        if (singleton == null)
            synchronized (Singleton.class) {
                if (singleton == null)
                    singleton = new Singleton();
            }
        return singleton;
    }
}

public class Singleton {
}
