package ExerciciosDIO;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        int nota = sc.nextInt();
        System.out.print("Insira a segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Insira a terceira nota: ");
        int nota3 = sc.nextInt();
        System.out.print("Insira a quarta nota: ");
        int nota4 = sc.nextInt();
        System.out.print("Insira seu nome: ");
        String nome = sc.next();

        int media = (nota + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            System.out.println(nome + " está aprovado");
        }else{
            System.out.println(nome + " está reprovado!");
        }
    }
}
