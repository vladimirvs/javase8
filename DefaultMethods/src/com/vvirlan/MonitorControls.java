package com.vvirlan;

public interface MonitorControls extends BaseInterface{
  void showMenu();
  void adjustBrightness(Integer newValue);
  void adjustContrast(Integer newValue);
  boolean getStatus();
  void setStatus(boolean on);
  void blank();

   int a = 100;
  default void power() {
    if (getStatus()) {
      System.out.println("Turning off "+a);
      setStatus(false);
    } else {
      System.out.println("Turning on");
      setStatus(true);
    }
  }
}
