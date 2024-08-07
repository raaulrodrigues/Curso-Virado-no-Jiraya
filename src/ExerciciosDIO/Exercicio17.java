package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a temperatura em fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsiusConvertido = (5 * ( fahrenheit -32) / 9);
        System.out.println("Essa temperatura em Celsius é: " + celsiusConvertido);


    }
}
