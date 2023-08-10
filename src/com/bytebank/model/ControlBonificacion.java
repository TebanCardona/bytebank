package com.bytebank.model;

public class ControlBonificacion {
  private double suma;

  /**
   * @param funcionario
   * @return double
   */
  public double registrarSalario(Funcionario funcionario) {
    this.suma = funcionario.getBonificacion() + this.suma;
    System.out.println("Calculo actual: " + this.suma);
    return this.suma;
  }
}
