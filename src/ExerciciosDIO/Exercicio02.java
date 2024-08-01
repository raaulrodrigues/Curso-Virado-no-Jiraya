package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é impar.");
        }

        if (num > 0){
            System.out.print("O número é positivo.");
        }else{
            System.out.print("O número é negativo.");
        }
    }
}
