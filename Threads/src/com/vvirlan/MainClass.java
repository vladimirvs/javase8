package com.vvirlan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainClass {
  public static void main(String[] args) {
    new MainClass().go();
  }

  private void go() {

    Runnable runnable = () -> {
      try {
        String name = Thread.currentThread().getName();
        System.out.println("Foo " + name);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Bar " + name);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    Thread thread = new Thread(runnable);
    thread.start();
    
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.submit(() -> {
        String threadName = Thread.currentThread().getName();
        System.out.println("Hello " + threadName);
    });

  }
}
