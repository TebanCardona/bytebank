public class testFuncionario {
  public static void main(String[] args) {
    Funcionario diego = new Funcionario();
    diego.setNombre("Diego");
    diego.setDocumento("1233");
    diego.setSalario(100);
    diego.setTipo(0);
    System.out.println(diego.getSalario());
    System.out.println(diego.getBonificacion());
    Gerente gerente = new Gerente();
    gerente.setTipo(1);
    gerente.setSalario(5000);
    System.out.println(gerente.getBonificacion());
  }
}