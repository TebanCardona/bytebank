package com.bytebank.model;

public class CuentaCorriente extends Cuenta {

  public CuentaCorriente(double saldo, int agencia, int numero, Cliente titular) {
    super(saldo, agencia, numero, titular);
  }

  /**
   * @param valor
   * @throws SaldoInsuficienteException
   */
  @Override
  public void retirar(double valor) throws SaldoInsuficienteException {
    double comision = 0.2;
    super.retirar(valor + comision);
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }
}