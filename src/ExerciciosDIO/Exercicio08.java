package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int numA = sc.nextInt();
        System.out.print("Insira o valor de B: ");
        int numB = sc.nextInt();
        System.out.print("Insira o valor de C: ");
        int numC = sc.nextInt();

        if(numA > numB && numA > numC && numB > numC){
            System.out.println("A, B, C");
        } else if (numA > numB && numA > numC && numB < numC){
            System.out.print("A, C, B");
        } else if(numB > numA && numB > numC && numA > numC){
            System.out.print("B, A, C");
        }else if(numB > numA && numB > numC && numA < numC){
            System.out.print("B, C, A");
        }else if(numC > numA && numC > numB && numA > numB){
            System.out.print("C, A, B");
        }else if(numC > numA && numC > numB && numA < numB){
            System.out.print("C, B, A");
        }
    }
}
