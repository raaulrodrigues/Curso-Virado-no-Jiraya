package ExercicioClasses.test;
import ExercicioClasses.dominio.Carro;

import java.util.Scanner;
public class CarroTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.print("Insira o nome do primeiro carro: ");
        carro1.nome = sc.next();
        System.out.print("Insira o modelo do primeiro carro: ");
        carro1.modelo = sc.next();
        System.out.print("Insira o ano do primeiro carro: ");
        carro1.ano = sc.nextInt();

        System.out.println("------------------------------------------------------");

        System.out.print("Insira o nome do segundo carro: ");
        carro2.nome = sc.next();
        System.out.print("Insira o modelo do segundo carro: ");
        carro2.modelo = sc.next();
        System.out.print("Insira o ano do segundo carro: ");
        carro2  .ano = sc.nextInt();

        System.out.println("Informações do carro 1: ");
        System.out.println(carro1.nome + "\n" + carro1.modelo + "\n" + carro1.ano);
        System.out.println("------------------------------------------------------");
        System.out.println("Informações do carro 2: ");
        System.out.println(carro2.nome + "\n" + carro2.modelo + "\n" + carro2.ano);
    }
}
