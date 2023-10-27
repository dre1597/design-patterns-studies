package org.example.creational.singleton;

import org.example.creational.singleton.singlethread.Singleton;

public class DemoSingleThread {
  public static void main(String[] args) {
    System.out.println("If you see the same value, then singleton was reused (yay!)\nIf you see different values, then 2 singletons were created (booo!!)\n\nRESULT:\n");
    Singleton singleton = Singleton.getInstance("FOO");
    Singleton anotherSingleton = Singleton.getInstance("BAR");
    System.out.println(singleton.value);
    System.out.println(anotherSingleton.value);
  }
}
