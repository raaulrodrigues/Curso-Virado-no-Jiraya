package maratonajava.javacore.Bintroducaometodos.Exercicio.test;

import maratonajava.javacore.Bintroducaometodos.Exercicio.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Raul");
        funcionario.setIdade(20);
        funcionario.setSalarios(new int[]{1200, 1400, 1600});

        funcionario.imprimir();
        funcionario.mediaSalario();
    }


}
