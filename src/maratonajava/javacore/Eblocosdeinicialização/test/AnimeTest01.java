package maratonajava.javacore.Eblocosdeinicialização.test;

import maratonajava.javacore.Eblocosdeinicialização.dominio.Anime;

import java.util.Scanner;

public class AnimeTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.println("Ep: " + episodio);
        }

    }
}
