package maratonajava.introducao;

public class ExercicioBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){
            System.out.println(i);
            if (i >= 25){
                break;
            }
        }
    }
}
