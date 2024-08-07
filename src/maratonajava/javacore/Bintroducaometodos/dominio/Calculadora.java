package maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public  double divideDoisNumeros(double num1, double num2){
        return num1/num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 67;
        num2 = 22;

        System.out.println("Startando alteraDoisNumeros.");
        System.out.print("num1: " + num1);
        System.out.print("\nnum2: " + num2);
        System.out.println("\nFinalizando alteraDoisNumeros.");
    }

}
