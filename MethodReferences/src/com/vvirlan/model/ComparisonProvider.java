package com.vvirlan.model;

public class ComparisonProvider {
  public int compareByBrand(Car a, Car b) {
    return a.getBrand().compareTo(b.getBrand());
  }
}
