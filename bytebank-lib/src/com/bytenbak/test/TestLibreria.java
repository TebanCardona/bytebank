package com.bytenbak.test;

import com.bytebank.model.Cuenta;
import com.bytebank.model.CuentaAhorros;

public class TestLibreria {
  public static void main(String[] args) {
    Cuenta cuenta = new CuentaAhorros(0, 0, 0, null);
    cuenta.depositar(200);
    System.out.println(cuenta.getSaldo());
  }
}
