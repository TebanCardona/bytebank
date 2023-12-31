package com.bytebank.model;

public class CuentaAhorros extends Cuenta {

  public CuentaAhorros(double saldo, int agencia, int numero, Cliente titular) {
    super(saldo, agencia, numero, titular);
  }

  /**
   * @param valor
   */
  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

}
