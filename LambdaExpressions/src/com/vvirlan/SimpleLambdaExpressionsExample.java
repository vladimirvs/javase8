package com.vvirlan;

import com.vvirlan.model.ArithmeticOperation;

public class SimpleLambdaExpressionsExample {

  public static void main(String[] args) {
    SimpleLambdaExpressionsExample inst = new SimpleLambdaExpressionsExample();
    inst.go();
        
  }

  private void go() {
   
    ArithmeticOperation addition = (int a, int b) -> a + b;
    ArithmeticOperation subtraction = (int a, int b) -> a - b;
    ArithmeticOperation multiplication = (int a, int b) -> a * b;
    ArithmeticOperation division = (int a, int b) -> a / b;
    
    System.out.println("10 + 10 = "+operate(10, 10, addition));
    System.out.println("10 - 10 = "+operate(10, 10, subtraction));
    System.out.println("10 * 10 = "+operate(10, 10, multiplication));
    System.out.println("10 / 10 = "+operate(10, 10, division));
    
  }
  
  private int operate(int a, int b, ArithmeticOperation operation) {
    return operation.operation(a, b);
  }
}
