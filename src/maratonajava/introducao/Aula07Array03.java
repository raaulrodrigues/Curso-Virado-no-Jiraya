package maratonajava.introducao;

public class Aula07Array03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        int [] num = {1,2,3,4,5};
        int [] num2 = new int[]{1,2,3,4,6};

        //for (int i = 0; i < num2.length; i++) {
       //     System.out.println(num2[i]);
      //  }
        for(int j:num2){
            System.out.print(j);
        }
    }
}
