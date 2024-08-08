package maratonajava.javacore.Bintroducaometodos.Exercicio.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public int [] salarios;


    public void imprimir(){
        System.out.println("Dados do funcionario: ");
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(int salario: salarios){
            System.out.println(salario + " ");
        }
    }

    public void mediaSalario(){
        int media = 0;
        for(int salario: salarios){
            media += salario;
        }

        media /= salarios.length;
        System.out.println("A média dos salários é: " + media);
    }
}
