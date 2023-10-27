package org.example.singleton;

import org.example.singleton.thread_safe.Singleton;

public class DemoThreadSafe {
  public static void main(String[] args) {
    System.out.println("If you see the same value, then singleton was reused (yay!)\nIf you see different values, then 2 singletons were created (booo!!)\n\nRESULT:\n");
    Thread threadFoo = new Thread(new ThreadFoo());
    Thread threadBar = new Thread(new ThreadBar());
    threadFoo.start();
    threadBar.start();
  }

  static class ThreadFoo implements Runnable {
    @Override
    public void run() {
      Singleton singleton = Singleton.getInstance("FOO");
      System.out.println(singleton.value);
    }
  }

  static class ThreadBar implements Runnable {
    @Override
    public void run() {
      Singleton singleton = Singleton.getInstance("BAR");
      System.out.println(singleton.value);
    }
  }
}
