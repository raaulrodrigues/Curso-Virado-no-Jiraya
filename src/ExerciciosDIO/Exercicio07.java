package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.print("Insira o segundo valor: ");
        int num2 = sc.nextInt();
        boolean verdade = true;

        if(num1 == num2){
            System.out.println(verdade);
        }else{
            System.out.println(!verdade);
        }

        if(num1 >= num2){
            System.out.println(verdade);
        }else{
            System.out.println(!verdade);
        }
    }
}
