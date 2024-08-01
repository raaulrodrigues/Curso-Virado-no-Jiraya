package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int numA = sc.nextInt();
        System.out.print("Insira o valor de B: ");
        int numB = sc.nextInt();
        System.out.print("Insira o valor de C: ");
        int numC = sc.nextInt();

        int soma = (numA + numB);

        System.out.println("A soma dos valores A e B é: " + soma);
        if (soma > numC){
            System.out.println("A soma dos valores A e B é maior que o valor de C.");
        }else{
            System.out.print("A soma dos valores A e B não é maior que o valor de C.");
        }
        sc.close();
    }
}
