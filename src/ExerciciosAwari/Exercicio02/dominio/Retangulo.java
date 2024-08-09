package ExerciciosAwari.Exercicio02.dominio;

public class Retangulo {
    private int largura;
    private int altura;
    private int area;
    private int perimetro;


    public void calcArea(int largura, int altura){
        area = largura * altura;
        System.out.println("A área desse retangulo é: " + area);
    }

    public void calcPerimetro(int largura, int altura){
        perimetro = 2 * (largura + altura);
        System.out.println("O perimetro desse retangulo é: " + perimetro);
    }
    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
