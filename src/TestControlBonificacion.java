import model.Contador;
import model.ControlBonificacion;
import model.Funcionario;
import model.Gerente;

public class TestControlBonificacion {
  public static void main(String[] args) {
    Funcionario diego = new Contador();
    diego.setSalario(2000);

    Gerente jim = new Gerente();
    jim.setSalario(10000);

    Contador alex = new Contador();
    alex.setSalario(3002);
    ControlBonificacion bonificacion = new ControlBonificacion();
    bonificacion.registrarSalario(jim);
    bonificacion.registrarSalario(alex);
    bonificacion.registrarSalario(diego);

  }
}
