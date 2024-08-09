package ExerciciosAwari.Exercicio03.dominio;

public class Aluno {
    private String nome;
    private int matricula;
    private double [] notas;
    private double media;


    public void mediaNotas(){
        if(notas == null){
            return;
        }

        for(double nota: notas){
            media += nota;
        }

        media = media / 3;
        System.out.println("A média das notas é: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

}
