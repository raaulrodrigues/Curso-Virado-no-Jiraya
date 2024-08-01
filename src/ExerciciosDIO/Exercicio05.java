package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o salário: ");
        double salario = sc.nextDouble();
        double salarioMinimo = 1293.20;

        double div = salario / salarioMinimo;

        System.out.printf("Seu salário equivale em salários mínimos: %.2f",div );


    }
}
