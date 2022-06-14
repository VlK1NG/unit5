package com.absoft.unit5.beans;

public final class SingletonExample {
    //   private static SingletonExample instance;
    public static SingletonExample Instance = new SingletonExample();

    private SingletonExample() {
    }

    //   public static SingletonExample getInstance() {
    //       if (instance == null) {
    //           instance = new SingletonExample();
    //       }
    //       return instance;
    //   }
}
