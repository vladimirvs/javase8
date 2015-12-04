package com.vvirlan;

public class MainClass {

  public static void main(String[] args) {
    new MainClass().go();
  }

  private void go() {
    testAnnotation();
    testMultiple();
  }

  @MyRepeatableAnnotation(name = "Bob", age = 10)
  @MyRepeatableAnnotation(name = "Alice", age = 12)
  private void testAnnotation() {
    System.out.println("Annotated method ");
  }

  @MyAnnotations({
    @MyRepeatableAnnotation(name = "Bob", age = 10),
    @MyRepeatableAnnotation(name = "Alice", age = 12) })
  private void testMultiple() {

  }
}
