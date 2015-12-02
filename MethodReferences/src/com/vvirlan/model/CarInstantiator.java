package com.vvirlan.model;

import java.util.ArrayList;
import java.util.List;

public class CarInstantiator {

  
  
  public List<Car> asList() {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car(Car.Color.RED, "Audi", 120000));
    cars.add(new Car(Car.Color.GREEN, "BMW", 10000));
    cars.add(new Car(Car.Color.BLUE, "Mercedes", 20000));
    cars.add(new Car(Car.Color.WHITE, "Dacia", 25000));
    return cars;
  }
  
  public Car[] asArray() {
    return asList().toArray(new Car[4]);
  }
}

