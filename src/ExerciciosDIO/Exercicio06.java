package ExerciciosDIO;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int num = sc.nextInt();

        double reajuste = 1.5;

        System.out.print("\nValor com reajuste: " + (num*reajuste));


    }
}
