package com.bytebank.test;

import com.bytebank.model.CuentaAhorros;
import com.bytebank.model.GuardarObjectos;

public class TestGuardarObjects {

  public static void main(String[] args) {
    CuentaAhorros ca = new CuentaAhorros(1, 23, 123, null);
    GuardarObjectos GO = new GuardarObjectos();
    GO.add(ca);
    System.out.println(GO.getObject(0));
  }
}
