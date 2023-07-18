public class Cuenta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  // Atributo Static
  private static int total = 0;

  // Constructor
  public Cuenta(double saldo, int agencia, int numero, Cliente titular) {
    this.agencia = agencia <= 0 ? 1 : agencia;
    this.numero = numero;
    this.saldo = saldo;
    this.titular = titular;
    ++total;
  }

  // metodos
  public void depositar(double valor) {
    this.saldo += valor;
  };

  public boolean retirar(double valor) {
    if (this.saldo < valor) {
      return false;
    }
    this.saldo -= valor;
    return true;
  }

  public boolean transferir(double valor, Cuenta cuenta) {
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
}