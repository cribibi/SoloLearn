package exercises;

//96. Afiseaza tabla inmultirii de la 1 la 10.

//good
public class Mtable {
    public static void main(String[] args) {
        for (int i = 1; i <11 ; i++) {
            for (int j = 1; j <11 ; j++) {
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println();
        }
    }
}
