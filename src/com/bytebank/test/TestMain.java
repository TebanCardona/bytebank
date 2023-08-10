package com.bytebank.test;

public class TestMain {
  public static void main(String[] args) {
    int[] edades = new int[5];
    edades[1] = 2;
    edades[0] = 32;
    for (int i = 0; i < edades.length; i++) {
      System.out.println(edades[i]);
    }
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
