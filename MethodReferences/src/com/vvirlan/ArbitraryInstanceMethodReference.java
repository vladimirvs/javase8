package com.vvirlan;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;


public class ArbitraryInstanceMethodReference {

  public static void main(String[] args) {
    ArbitraryInstanceMethodReference ins = new ArbitraryInstanceMethodReference();
    ins.go();
  }

  private void go() {

    String[] array = { "Zoi", "Wow", "Aoc", "Dao", "Fao", "Aao" };
    Arrays.sort(array, String::compareToIgnoreCase);
    System.out.println("--------NEW-------");
    printArray(array);
    System.out.println("--------OLD-------");
    array = new String[] { "Zoi", "Wow", "Aoc", "Dao", "Fao", "Aao" };
    // Old aproach
    Arrays.sort(array, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
      }
    });
    //Equivalent with lambda
    Arrays.sort(array, (String a, String b) -> a.compareToIgnoreCase(b));
    printArray(array);
    
    File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
      public boolean accept(File file) {
          return file.isHidden();
      }
  });
    
    hiddenFiles = new File(".").listFiles(File::isHidden);

  }

  private void printArray(String[] array) {
    for (String s : array) {
      System.out.println(s);
    }
  }
}
