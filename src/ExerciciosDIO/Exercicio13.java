package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome da pessoa: ");
        String nome = sc.next();
        System.out.print("Insira a idade da pessoa: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        }else{
            System.out.println(nome + " é menor de idade.");
        }
    }
}
