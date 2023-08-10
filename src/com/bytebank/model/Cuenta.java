package com.bytebank.model;

/**
 * Cuenta va crear nuevas instancias de CuentaCorriente y CuentaAhorras
 * 
 * @author TebanCardona
 */
public abstract class Cuenta {
  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  // Atributo Static
  private static int total = 0;

  // Constructor

  /**
   * Instancia Cuenta con Saldo Agencia Numero y la cuenta Titular
   * 
   * @param saldo
   * @param agencia
   * @param numero
   * @param titular
   */
  public Cuenta(double saldo, int agencia, int numero, Cliente titular) {
    this.agencia = agencia <= 0 ? 1 : agencia;
    this.numero = numero;
    this.saldo = saldo;
    this.titular = titular;
    ++total;
  }

  /**
   * @param valor
   * @throws SaldoInsuficienteException
   */
  /**
   * @param valor
   * @throws SaldoInsuficienteException
   */
  /**
   * @param valor
   * @throws SaldoInsuficienteException
   */
  // metodos
  public abstract void depositar(double valor);

  public void retirar(double valor) throws SaldoInsuficienteException {
    if (this.saldo < valor) {
      throw new SaldoInsuficienteException("No Tiene Saldo");
    }
    this.saldo -= valor;
  }

  public boolean transferir(double valor, Cuenta cuenta) throws SaldoInsuficienteException {
    this.retirar(valor);
    cuenta.depositar(valor);
    return true;
  }

  // Setters
  public void setAgencia(int agencia) {
    if (agencia > 0) {
      this.agencia = agencia;
    }
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public void setNumero(int numero) {
    if (numero > 0) {
      this.numero = numero;
    }
  }

  // Getters
  public int getAgencia() {
    return agencia;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return numero;
  }

  public Cliente getTitular() {
    return titular;
  }

  // Getter Static
  public static int getTotal() {
    return total;
  }

  @Override
  public String toString() {
    return "hola Soy la cuenta" + getNumero();

  }

  @Override
  public boolean equals(Object obj) {
    Cuenta cuenta = (Cuenta) obj;
    return this.agencia == cuenta.getAgencia() && this.numero == cuenta.getNumero();
  }
}
