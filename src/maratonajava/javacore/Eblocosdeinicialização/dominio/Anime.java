package maratonajava.javacore.Eblocosdeinicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //1- Alocaloda espaço de memória pro objeto
    //2- Cada atributo de classe é criado e inicializado com valores default ou o que for passar
    //3- Bloco de inicialização é executado
    //4- Construtor é executado
    {
        System.out.println("Bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: this.episodios){
            System.out.println("Ep: " + episodio);
        }
    }
}
