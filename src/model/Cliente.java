package model;

public class Cliente implements Autenticable {
  private String nombre;
  private String documento;
  private String tel;

  private AutentacacionUtil util;

  public Cliente(String nombre, String documento, String tel) {
    this.nombre = nombre;
    this.documento = documento;
    this.tel = tel;
    this.util = new AutentacacionUtil();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public boolean iniciarSesion(String clave) {
    return this.util.iniciarSesion(clave);
  }

  public void setClave(String clave) {
    this.util.setClave(clave);
  }

}
