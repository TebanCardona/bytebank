package com.bytebank.test;

import com.bytebank.model.Administrador;
import com.bytebank.model.Gerente;
import com.bytebank.model.SistemaInterno;

public class TestSistemaInterno {
  public static void main(String[] args) {
    SistemaInterno sist = new SistemaInterno();
    Administrador admin = new Administrador();
    Gerente jul = new Gerente();
    jul.setClave("12345");
    System.out.println(sist.autentica(jul));
    System.out.println(sist.autentica(admin));

  }
}