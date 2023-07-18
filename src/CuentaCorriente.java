public class CuentaCorriente extends Cuenta {

  public CuentaCorriente(double saldo, int agencia, int numero, Cliente titular) {
    super(saldo, agencia, numero, titular);
  }

  @Override
  public boolean retirar(double valor) {
    double comision = 0.2;
    return super.retirar(valor + comision);
  }
}