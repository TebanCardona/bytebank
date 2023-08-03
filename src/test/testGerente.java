package test;

import model.Gerente;

public class testGerente {
  public static void main(String[] args) {
    Gerente ger = new Gerente();
    ger.setClave("abs");
    System.out.println(ger.iniciarSesion("abs"));
  }
}
