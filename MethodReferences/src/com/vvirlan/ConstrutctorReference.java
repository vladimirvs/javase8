package com.vvirlan;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import com.vvirlan.model.Car;
import com.vvirlan.model.CarInstantiator;

public class ConstrutctorReference {
  private CarInstantiator inst = new CarInstantiator();

  public static void main(String[] args) {
    ConstrutctorReference inst = new ConstrutctorReference();
    inst.go();
  }

  private void go() {
    List<Car> cars = inst.asList();
    Set<Car> carsSetLambda = transferElements(cars, ()->{return new HashSet<>();});
    System.out.println(carsSetLambda);
    Set<Car> carsSetNew = transferElements(cars, HashSet<Car>::new);
    System.out.println(carsSetNew);
  }
  
  public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
      SOURCE sourceCollection, Supplier<DEST> collectionFactory) {

    DEST result = collectionFactory.get();
    for (T t : sourceCollection) {
      result.add(t);
    }
    return result;
  }
}
