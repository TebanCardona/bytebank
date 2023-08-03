package model;

public class SistemaInterno {
  private String clave = "12345";

  public boolean autentica(Autenticable fun) {
    return fun.iniciarSesion(clave);
  }
}
