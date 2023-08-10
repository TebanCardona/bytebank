package com.bytebank.model;

public class SistemaInterno {
  private String clave = "12345";

  /**
   * @param fun
   * @return boolean
   */
  public boolean autentica(Autenticable fun) {
    return fun.iniciarSesion(clave);
  }
}
