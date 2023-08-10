package com.bytebank.test;

import com.bytebank.model.Cuenta;
import com.bytebank.model.CuentaAhorros;
import com.bytebank.model.SaldoInsuficienteException;

public class TestCuentaExepction {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Cuenta cuenta = new CuentaAhorros(0, 0, 0, null);
    cuenta.depositar(200);
    try {
      cuenta.retirar(2000);
    } catch (SaldoInsuficienteException e) {
      e.printStackTrace();
    }
  }
}
