package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.model.Cuenta;
import com.bytebank.model.CuentaCorriente;

public class TestArrayList {
  public static void main(String[] args) {
    ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
    Cuenta cc = new CuentaCorriente(123, 0, 0, null);
    Cuenta cc2 = new CuentaCorriente(41, 0, 0, null);
    lista.add(cc);
    lista.add(cc2);
    Cuenta obtenerCuenta = lista.get(0);
    System.out.println(obtenerCuenta);
    for (Cuenta cuenta : lista) {
      System.out.println(cuenta.getSaldo());

    }
  }
}
