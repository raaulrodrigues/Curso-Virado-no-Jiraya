package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Insira a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.print("Sua média foi: " + media);
    }
}
