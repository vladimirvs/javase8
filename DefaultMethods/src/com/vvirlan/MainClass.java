package com.vvirlan;

public class MainClass {

  public static void main(String[] args) {
    MainClass mc = new MainClass();
    mc.go();
  }

  private void go() {
    MonitorControls controls = new DesktopMonitorControls();
    controls.power();
    controls.adjustBrightness(10);
    controls.power();
    controls.mainTrait();
    Connectors.mystat();
    
    
    
    
  }
}
