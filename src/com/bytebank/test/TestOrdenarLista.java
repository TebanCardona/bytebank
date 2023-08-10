package com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.model.Cliente;
import com.bytebank.model.Cuenta;
import com.bytebank.model.CuentaAhorros;
import com.bytebank.model.CuentaCorriente;

public class TestOrdenarLista {
  public static void main(String[] args) {
    Cuenta cc1 = new CuentaCorriente(22, 22, 33, null);
    Cliente clienteCC1 = new Cliente(null, null, null);
    clienteCC1.setNombre("Diego");
    cc1.setTitular(clienteCC1);
    cc1.depositar(333.0);

    Cuenta cc2 = new CuentaAhorros(22, 44, 44, null);
    Cliente clienteCC2 = new Cliente(null, null, null);
    clienteCC2.setNombre("Renato");
    cc2.setTitular(clienteCC2);
    cc2.depositar(444.0);

    Cuenta cc3 = new CuentaCorriente(22, 22, 11, null);
    Cliente clienteCC3 = new Cliente(null, null, null);
    clienteCC3.setNombre("Alejo");
    cc3.setTitular(clienteCC3);
    cc3.depositar(111.0);

    Cuenta cc4 = new CuentaAhorros(22, 22, 22, null);
    Cliente clienteCC4 = new Cliente(null, null, null);
    clienteCC4.setNombre("Noel");
    cc4.setTitular(clienteCC4);
    cc4.depositar(222.0);

    List<Cuenta> lista = new ArrayList<>();
    lista.add(cc1);
    lista.add(cc2);
    lista.add(cc3);
    lista.add(cc4);
    // ? Ordenar las cuentas
    // Comparator<Cuenta> comparator = new OrdenadorPorNombre();
    // lista.sort(comparator);
    lista.sort(new Comparator<Cuenta>() {
      @Override
      public int compare(Cuenta o1, Cuenta o2) {
        return Integer.compare(o1.getNumero(), o2.getNumero());
      }
    });
    for (Cuenta cuenta : lista) {
      System.out.println(cuenta.getTitular().getNombre());
    }
  }
}

class OrdenadorPorNombre implements Comparator<Cuenta> {
  @Override
  public int compare(Cuenta o1, Cuenta o2) {
    return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
  }
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

  @Override
  public int compare(Cuenta o1, Cuenta o2) {
    // Forma intermedia return o1.getNumero() - o2.getNumero();
    // Wrapper
    return Integer.compare(o1.getNumero(), o2.getNumero());

  }
}