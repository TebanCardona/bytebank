package com.bytebank.test;

import com.bytebank.model.Gerente;

public class testGerente {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Gerente ger = new Gerente();
    ger.setClave("abs");
    System.out.println(ger.iniciarSesion("abs"));
  }
}
