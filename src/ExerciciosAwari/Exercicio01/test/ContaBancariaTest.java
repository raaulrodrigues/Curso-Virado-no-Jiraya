package ExerciciosAwari.Exercicio01.test;

import ExerciciosAwari.Exercicio01.dominio.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Insira o nome do titular da conta: ");
        conta.setNomeTitular(sc.next());
        System.out.print("Insira o número da conta: ");
        conta.setNumConta(sc.nextInt());
        System.out.print("Insira o saldo da conta: ");
        conta.setSaldo(sc.nextInt());

        System.out.print("Saldo que será adicionado: ");
        int saldoAdicionado = sc.nextInt();
        conta.adicionarSaldo(saldoAdicionado);

        System.out.print("\nSaldo que será retirado: ");
        int saldoRetirado = sc.nextInt();
        conta.retirarSaldo(saldoRetirado);

    }
}
