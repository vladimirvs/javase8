package com.vvirlan;

import java.util.Optional;

public class MainClass {
  public static void main(String[] args) {
    new MainClass().go();
  }

  private void go() {
    Computer comp = new Computer();
    Optional<Soundcard> snd = comp.getSoundcard();
    snd.ifPresent(System.out::println);
  }
}
