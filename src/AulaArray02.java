public class AulaArray02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0
        //boolean false
        //String null

        String[] nomes = new String [3];
        nomes[0] = "Naruto";
        nomes[1] = "Nagato";
        nomes[2] = "Fushiguru";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
