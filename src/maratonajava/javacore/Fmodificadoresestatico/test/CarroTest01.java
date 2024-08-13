package maratonajava.javacore.Fmodificadoresestatico.test;

import maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 290);
        Carro c3 = new Carro("Audi", 310);

        Carro.velocidadeLimite = 210;
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
