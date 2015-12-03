package com.vvirlan;

public class DesktopMonitorControls implements MonitorControls, Connectors {
  private boolean on;

  @Override
  public void showMenu() {
    System.out.println("Showing Menu");
  }

  @Override
  public void adjustBrightness(Integer newValue) {
    System.out.println("Adjusting Brightness");
  }

  @Override
  public void adjustContrast(Integer newValue) {
    System.out.println("Adjusting Contrast");
  }

  @Override
  public boolean getStatus() {
    return this.on;
  }

  @Override
  public void setStatus(boolean on) {
    this.on = on;
  }
  
 

  @Override
  public void hdmi() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void rgb() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void power() {
    // TODO Auto-generated method stub
    MonitorControls.super.power();
  }

  @Override
  public void blank() {
    System.out.println("Blank");
    
  }



 
}
