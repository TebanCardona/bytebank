public class Gerente extends Funcionario implements Autenticable {
  private AutentacacionUtil util;

  public Gerente() {
    this.util = new AutentacacionUtil();
  }

  public boolean iniciarSesion(String clave) {
    return this.util.iniciarSesion(clave);
  }

  public void setClave(String clave) {
    this.util.setClave(clave);
  }

  @Override
  public double getBonificacion() {
    return super.getSalario();
  }
}
