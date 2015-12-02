package com.vvirlan;

import java.util.Arrays;
import java.util.List;

import com.vvirlan.model.Car;
import com.vvirlan.model.CarInstantiator;
import com.vvirlan.model.CarsComparator;

public class StaticMethodReference {

  private CarInstantiator inst = new CarInstantiator();

  public static void main(String[] args) {

    StaticMethodReference smr = new StaticMethodReference();
    smr.go();

  }

  private void go() {
    List<Car> cars = inst.asList();
    System.out.println("Inital cars: " + cars);
    Car[] carsArray = new CarInstantiator().asArray();

    // Old way
    Car.printArrayOfCars(carsArray);
    System.out.println("--------------------");
    Arrays.sort(carsArray, new CarsComparator());
    Car.printArrayOfCars(carsArray);
    System.out.println("====================");
    // New way
    carsArray = new CarInstantiator().asArray();
    Car.printArrayOfCars(carsArray);
    System.out.println("--------------------");
    Arrays.sort(carsArray, Car::compareByMileage);
    //Equivalent lambda expression
    Arrays.sort(carsArray, (a,b) -> Car.compareByMileage(a,b));
    Car.printArrayOfCars(carsArray);
  }

 
}
