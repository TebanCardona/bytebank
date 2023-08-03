package test;

import model.Cliente;
import model.CuentaAhorros;
import model.CuentaCorriente;
import model.SaldoInsuficienteException;

public class TestCuenta {
  public static void main(String[] args) {
    Cliente jose = new Cliente("jose", "1231231231", "asdasd1232");
    CuentaCorriente cc = new CuentaCorriente(0, 0, 0, jose);
    CuentaAhorros ca = new CuentaAhorros(0, 0, 0, jose);
    cc.depositar(2000);
    try {
      cc.transferir(1000, ca);
    } catch (SaldoInsuficienteException e) {
      e.printStackTrace();
    }
    System.out.println(cc.getSaldo());
    System.out.println(ca.getSaldo());

  }
}