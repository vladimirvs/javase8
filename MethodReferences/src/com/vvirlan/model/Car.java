package com.vvirlan.model;

public class Car {
  public enum Color {
    WHITE, BLACK, RED, GREEN, BLUE
  }

  private Color color;
  private String brand;
  private int mileage;

  public Car() {
  }

  public Car(Color color, String brand, int mileage) {
    super();
    this.color = color;
    this.brand = brand;
    this.mileage = mileage;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getMileage() {
    return mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  @Override
  public String toString() {
    return "Car [color=" + color + ", brand=" + brand + ", mileage=" + mileage + "]";
  }
  
  public static int compareByMileage(Car a, Car b) {
    return a.mileage - b.mileage;
  }

}
