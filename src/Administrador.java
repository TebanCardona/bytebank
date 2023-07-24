public class Administrador extends Funcionario implements Autenticable {
  @Override
  public double getBonificacion() {
    return super.getSalario();
  }

  @Override
  public void setClave(String clave) {

  }

  @Override
  public boolean iniciarSesion(String clave) {
    return true;
  }
}
