package com.vvirlan;

import java.lang.annotation.Repeatable;

@Repeatable(MyAnnotations.class)
public @interface MyRepeatableAnnotation {

  String name() default "noname";

  int age() default 0;
}
