package ClassesAbstratas.Classes;

public class Gerente extends Funcionario{

    public Gerente(){

    }

    @Override
    public void CalcularSalario() {
        this.salario = salario + (salario * 0.2);
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }


}
