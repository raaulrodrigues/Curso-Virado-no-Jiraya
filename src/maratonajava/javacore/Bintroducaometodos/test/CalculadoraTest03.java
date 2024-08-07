package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int num1 = 11;
        int num2 = 15;

        calc.alteraDoisNumeros(num1,num2);
        System.out.println("Printando CalculadoraTest03");
        System.out.print("num1: " + num1);
        System.out.print("\nnum2: " + num2);
    }
}
