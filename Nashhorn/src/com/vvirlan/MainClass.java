package com.vvirlan;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainClass {
  public static void main(String[] args) {
    new MainClass().go();
  }

  private void go() {

    ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    try {
      engine.eval("print('Hello World!');");
    } catch (ScriptException e) {
      e.printStackTrace();
    }
    
    try {
      engine.eval (new FileReader ("script.js"));
    } catch (FileNotFoundException | ScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  //get handle of JavaScript file’s context
    Invocable invocable = (Invocable) engine;

    //invoke function defined in the file’s context and pass the argument.
    Object result = new Object();
    try {
      result = invocable.invokeFunction ("fun1", "Mr. X");
    } catch (NoSuchMethodException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    //print the result and its type.
    System.out.println (result);
    System.out.println (result.getClass ()); 
  }
}
