package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import maratonajava.javacore.Bintroducaometodos.dominio.ImprimirEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimirEstudante impressora = new ImprimirEstudante();
        estudante01.nome = "Midoriya";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Nami";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        impressora.imprimir(estudante01);
        System.out.println("------------------");
        impressora.imprimir(estudante02);

    }
}
