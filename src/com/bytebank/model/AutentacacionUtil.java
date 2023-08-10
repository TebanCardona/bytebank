package com.bytebank.model;

public class AutentacacionUtil {
  private String clave;

  /**
   * @param clave
   * @return boolean
   */
  public boolean iniciarSesion(String clave) {
    return this.clave == clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }
}
