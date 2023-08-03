package test;

import model.Cuenta;
import model.CuentaAhorros;
import model.SaldoInsuficienteException;

public class TestCuentaExepction {
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