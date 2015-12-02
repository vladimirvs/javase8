package com.vvirlan;

import java.util.Arrays;
import java.util.List;

import com.vvirlan.model.Car;
import com.vvirlan.model.CarInstantiator;
import com.vvirlan.model.ComparisonProvider;

public class InstanceMethodReference {
  private CarInstantiator inst = new CarInstantiator();

  public static void main(String[] args) {
    InstanceMethodReference imr = new InstanceMethodReference();
    imr.go();

  }

  private void go() {
    List<Car> cars = inst.asList();
    System.out.println("Inital cars: " + cars);
    Car[] carsArray = new CarInstantiator().asArray();
    ComparisonProvider comparisonProvider = new ComparisonProvider();
    Arrays.sort(carsArray, comparisonProvider::compareByBrand);
    Car.printArrayOfCars(carsArray);

  }
}
