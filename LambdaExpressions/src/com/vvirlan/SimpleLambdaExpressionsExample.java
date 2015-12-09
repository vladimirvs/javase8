package com.vvirlan;

import com.vvirlan.model.ArithmeticOperation;

public class SimpleLambdaExpressionsExample {

  public static void main(String[] args) {
    SimpleLambdaExpressionsExample inst = new SimpleLambdaExpressionsExample();
    inst.go();

  }

  private void go() {

    ArithmeticOperation addition = (int a, int b, int c) -> a + b + c;
    ArithmeticOperation subtraction = (int a, int b, int c) -> a - b - c;
    ArithmeticOperation multiplication = (int a, int b, int c) -> a * b * c;
    ArithmeticOperation division = (int a, int b, int c) -> a / b / c;

    System.out.println("10 + 10 = " + operate(10, 10, 10, addition));
    System.out.println("10 - 10 = " + operate(10, 10, 20, subtraction));
    System.out.println("10 * 10 = " + operate(10, 10, 30, multiplication));
    System.out.println("10 / 10 = " + operate(10, 10, 40, division));

  }

  private int operate(int a, int b, int c, ArithmeticOperation operation) {
    return operation.operation(a, b, c);
  }
}
