package com.vvirlan;

public interface Connectors extends BaseInterface{

  void hdmi();
  void rgb();
  void blank();
  default void power(){
    System.out.println("Power cable is present");
  }
  
  static void mystat(){
    System.out.println("Nothing Special");
  }
  
}
