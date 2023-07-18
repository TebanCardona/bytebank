public class Cliente {
  private String nombre;
  private String documento;
  private String tel;

  public Cliente(String nombre, String documento, String tel) {
    this.nombre = nombre;
    this.documento = documento;
    this.tel = tel;
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

}
