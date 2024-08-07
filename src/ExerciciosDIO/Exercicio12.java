package ExerciciosDIO;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do produto: ");
        String produto1 = sc.next();
        System.out.print("Insira o valor do produto: ");
        double produtoPreco = sc.nextDouble();

        System.out.println("Escolha uma forma de pagamento \n" +
                "[1]Dinheiro/Pix\n" +
                "[2]À vista no cartão\n" +
                "[3]Parcelado 2 vezes no cartão\n" +
                "[4]Parcelado 3 vezes ou mais no cartão");

        int escolha = sc.nextInt();


        if(escolha == 1){
            double valorComDesconto = produtoPreco - (produtoPreco * 0.15);
            System.out.println("Produto: " + produto1);
            System.out.println("Valor a ser pago: " + valorComDesconto);
        }else if(escolha == 2){
            double valorComDesconto = produtoPreco - (produtoPreco * 0.10);
            System.out.println("Produto: " + produto1);
            System.out.println("Valor a ser pago: " + valorComDesconto);
        }else if(escolha == 3){
            System.out.println("Produto: " + produto1);
            System.out.println("Valor a ser pago: " + produtoPreco);
        }else if(escolha == 4){
            double valorComJuros = produtoPreco + (produtoPreco * 0.10);
            System.out.println("Produto: " + produto1);
            System.out.println("Valor a ser pago: " + valorComJuros);
        }else{
            System.out.println("Escolha inválida!");
        }
    }
}
