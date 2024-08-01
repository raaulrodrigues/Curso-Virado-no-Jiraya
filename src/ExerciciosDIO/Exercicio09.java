package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Insira sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC é: %.2f", IMC);

        if(IMC < 18.5){
            System.out.print("\nAbaixo do peso");
        }else if(IMC >= 18.6 && IMC < 24.9){
            System.out.print("\nPeso ideal");
        }else if(IMC >= 25.0 && IMC < 29.9){
            System.out.print("\nLevemente acima do peso");
        }else if(IMC >= 30.0 && IMC < 34.9){
            System.out.print("\nObesidade grau I");
        }else if(IMC >= 35.0 && IMC < 39.9){
            System.out.print("\nObesidade grau II (severa)");
        }else if(IMC >= 40.0){
            System.out.print("\nObesidade grau III (mórbida)");
        }
    }
}
