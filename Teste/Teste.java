package ClassesAbstratas.Teste;

import ClassesAbstratas.Classes.Funcionario;
import ClassesAbstratas.Classes.Gerente;
import ClassesAbstratas.Classes.Vendedor;

public class Teste {

    public static void main(String[] args) {
        Gerente g = new Gerente("Bia", "20158-5", 2000);
        Vendedor v = new Vendedor("Camila", "20844-7", 1500, 5000);
        v.CalcularSalario();
        g.CalcularSalario();
        System.out.println(v);
        System.out.println(g);
    }
}
