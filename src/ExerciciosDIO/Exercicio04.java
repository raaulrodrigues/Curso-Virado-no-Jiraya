package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("O antecessor: ");
        int num = sc.nextInt();

        System.out.println(num);
        System.out.println("O antecessor: " + (num - 1));
        System.out.println("O sucessor: " + (num + 1));
    }
}
