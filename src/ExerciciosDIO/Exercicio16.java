package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o lado um: ");
        int ladoA = sc.nextInt();
        System.out.println("Insira o lado dois: ");
        int ladoB = sc.nextInt();
        System.out.println("Insira o lado três: ");
        int ladoC = sc.nextInt();

        if (ladoA + ladoB > ladoC) {
            System.out.println("Esse triangulo existe.");
            if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("É um triangulo escaleno.");
            }else if(ladoA == ladoB && ladoA != ladoC && ladoB != ladoC || ladoB == ladoC && ladoB != ladoA && ladoC != ladoA || ladoC == ladoA && ladoC != ladoB && ladoA != ladoB){
                System.out.println("É um triangulo isósceles.");
            }else if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
                System.out.println("É um triangulo equilatero.");
            }
        }else if(ladoA + ladoC > ladoB){
            System.out.println("Esse triangulo existe.");

            if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("É um triangulo escaleno.");
            }else if(ladoA == ladoB && ladoA != ladoC && ladoB != ladoC || ladoB == ladoC && ladoB != ladoA && ladoC != ladoA || ladoC == ladoA && ladoC != ladoB && ladoA != ladoB){
                System.out.println("É um triangulo isósceles.");
            }else if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
                System.out.println("É um triangulo equilatero.");
            }
        }else if(ladoB + ladoC > ladoA){
            System.out.println("Esse triangulo existe.");
            if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("É um triangulo escaleno.");
            }else if(ladoA == ladoB && ladoA != ladoC && ladoB != ladoC || ladoB == ladoC && ladoB != ladoA && ladoC != ladoA || ladoC == ladoA && ladoC != ladoB && ladoA != ladoB){
                System.out.println("É um triangulo isósceles.");
            }else if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
                System.out.println("É um triangulo equilatero.");
            }
        }
    }
}
