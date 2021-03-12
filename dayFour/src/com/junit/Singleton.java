package com.junit;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    public synchronized static Singleton getInstance() {
        if ( instance == null ) {
            synchronized (instance) {
                if ( instance == null )
                    instance = new Singleton();
            }
        }
        return instance;
    }
    public static void main(String[] args) {


    }

}
