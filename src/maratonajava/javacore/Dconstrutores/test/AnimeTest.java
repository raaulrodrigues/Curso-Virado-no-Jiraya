package maratonajava.javacore.Dconstrutores.test;

import maratonajava.javacore.Dconstrutores.dominio.Anime;

import java.util.Scanner;

public class AnimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anime anime = new Anime();

//        System.out.print("Insira o tipo: ");
//        anime.setTipo(sc.next());
//        System.out.print("Insira a quantidade de episódios: ");
//        anime.setEpisodios(sc.nextInt());
//        System.out.print("Insira o nome: ");
//        anime.setNome(sc.next());
        System.out.println("Insira os dados: ");
        anime.init(sc.next(),sc.next(), sc.nextInt());
        anime.init(sc.next(),sc.next(), sc.nextInt(), sc.next());

        anime.imprime();
    }
}
