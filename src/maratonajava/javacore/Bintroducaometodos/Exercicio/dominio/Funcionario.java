package maratonajava.javacore.Bintroducaometodos.Exercicio.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private int [] salarios;
    private int media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int[] getSalarios() {
        return salarios;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }

    public int getMedia() {
        return media;
    }

    public void imprimir(){
        System.out.println("Dados do funcionario: ");
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(int salario: salarios){
            System.out.println(salario + " ");
        }
    }

    public void mediaSalario(){
        if(salarios == null){
            return;
        }

        for(int salario: salarios){
            media += salario;
        }

        media /= salarios.length;
        System.out.println("A média dos salários é: " + media);
    }
}
