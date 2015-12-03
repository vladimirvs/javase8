package com.vvirlan;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

public class MainClass {

  public static void main(String[] args) {
    MainClass mc = new MainClass();
    mc.go();
  }

  private void go() {
    predicate();
    consumer();
    function();
    supplier();
    custom();
  }

  private void custom() {
    MyPersonalFunctionalInterface<String> mine = (x) -> System.out.println("Hello "+x);
    mine.say("Vlad");
    
  }

  private void supplier() {
    Random r = new Random();
    Supplier<Integer> intSupplier = () -> r.nextInt(25);
    int len = 10;

    Supplier<String> randomStrSupplier = () -> {
      String alpha = "abcdefghijklmnopqrstuvwxyz";
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < len; i++) {
        sb.append(alpha.toCharArray()[intSupplier.get()]);
      }
      return sb.toString();
    };

    System.out.println(intSupplier.get());
    System.out.println(randomStrSupplier.get());
  }

  private void function() {
    Function<String, Integer> function = (f) -> f.length();
    System.out.println(function.apply("Hello There!"));
  }

  private void consumer() {
    Consumer<String> consumer = (x) -> System.out.println(x.toUpperCase());
    consumer.accept("Hello World!");
  }

  private void predicate() {
    Predicate<String> p = String::isEmpty;
    System.out.println(p.test("aha"));
  }
}
