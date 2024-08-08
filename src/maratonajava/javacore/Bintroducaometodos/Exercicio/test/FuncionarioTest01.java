package maratonajava.javacore.Bintroducaometodos.Exercicio.test;

import maratonajava.javacore.Bintroducaometodos.Exercicio.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Raul";
        funcionario.idade = 20;
        funcionario.salarios = new int[]{1200, 1400, 1600};

        funcionario.imprimir();
        funcionario.mediaSalario();
    }


}
