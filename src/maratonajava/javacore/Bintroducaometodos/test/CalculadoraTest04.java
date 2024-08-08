package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        int [] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(numeros);
    }
}
