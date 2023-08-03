public class Administrador extends Funcionario implements Autenticable {
  private AutentacacionUtil util;

  public Administrador() {
    this.util = new AutentacacionUtil();
  }

  @Override
  public double getBonificacion() {
    return super.getSalario();
  }

  public boolean iniciarSesion(String clave) {
    return this.util.iniciarSesion(clave);
  }

  public void setClave(String clave) {
    this.util.setClave(clave);
  }
}
