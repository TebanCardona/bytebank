package com.bytebank.test;

import com.bytebank.model.CuentaAhorros;
import com.bytebank.model.CuentaCorriente;

public class TestArregloReferencias {

  public static void main(String[] args) {
    CuentaCorriente cc = new CuentaCorriente(0, 0, 0, null);
    Object[] ref = new Object[5];
    ref[0] = cc;
    System.out.println(ref[0]);
    // ?Cast
    ref[1] = new CuentaAhorros(0, 0, 0, null);

  }
}
