package ExerciciosAwari.Exercicio02.test;

import ExerciciosAwari.Exercicio02.dominio.Retangulo;

import java.util.Scanner;

public class RetanguloTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("Insira a largura do retangulo: ");
        retangulo.setLargura(sc.nextInt());
        System.out.print("Insira a altura do retangulo: ");
        retangulo.setAltura(sc.nextInt());

        retangulo.calcArea(retangulo.getLargura(), retangulo.getAltura());
        retangulo.calcPerimetro(retangulo.getLargura(), retangulo.getAltura());
    }
}
