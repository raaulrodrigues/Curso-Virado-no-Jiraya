package ExerciciosDIO;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int numA = sc.nextInt();
        System.out.print("Insira o valor de B: ");
        int numB = sc.nextInt();
        System.out.print("Insira o valor de C: ");
        int numC = sc.nextInt();

        if (numA == numB){
            int soma = (numA + numB);
            System.out.print(soma + numC);
        }else{
            int mult = (numA * numB);
            System.out.print(mult + numC);
        }
    }
}
