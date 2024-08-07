package maratonajava.introducao;

public class ExercicioFor {
    public static void main(String[] args) {
        int num = 0;

        for(num = 0; num < 1000001; num++){
            if(num % 2 == 0){
                System.out.println("Positivo: " + num);
            }
        }
    }
}
