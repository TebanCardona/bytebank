package com.bytebank.test;

import com.bytebank.model.Contador;
import com.bytebank.model.Gerente;

public class testFuncionario {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Contador diego = new Contador();
    diego.setNombre("Diego");
    diego.setDocumento("1233");
    diego.setSalario(100);
    diego.setTipo(0);
    System.out.println(diego.getSalario());
    System.out.println(diego.getBonificacion());
    Gerente gerente = new Gerente();
    gerente.setTipo(1);
    gerente.setSalario(5000);
    System.out.println(gerente.getBonificacion());
  }
}
