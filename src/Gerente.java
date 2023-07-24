public class Gerente extends Funcionario implements Autenticable {
  private String clave;

  public void setClave(String clave) {
    this.clave = clave;
  }

  public boolean iniciarSesion(String clave) {
    return this.clave == clave;
  }

  public double getBonificacion() {
    return super.getSalario() + this.getSalario();
  }
}
