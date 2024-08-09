package ExerciciosAwari.Exercicio03.test;

import ExerciciosAwari.Exercicio03.dominio.Aluno;

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Insira o nome do aluno: ");
        aluno.setNome(sc.next());
        System.out.print("Insira o numero da matricula do aluno: ");
        aluno.setMatricula(sc.nextInt());


        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Insira as notas do aluno: ");
            notas[i] = sc.nextDouble();
        }

        aluno.setNotas(notas);
        aluno.mediaNotas();
    }
}
