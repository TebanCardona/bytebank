package com.bytebank.model;

public class Administrador extends Funcionario implements Autenticable {
  private AutentacacionUtil util;

  public Administrador() {
    this.util = new AutentacacionUtil();
  }

  /**
   * @return double
   */
  @Override
  public double getBonificacion() {
    return super.getSalario();
  }

  /**
   * @param clave
   * @return boolean
   */
  public boolean iniciarSesion(String clave) {
    return this.util.iniciarSesion(clave);
  }

  public void setClave(String clave) {
    this.util.setClave(clave);
  }
}
