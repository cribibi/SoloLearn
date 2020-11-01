package exercises;

//94. Calculat factorial de n
public class Factorial {
    public static void main(String[] args) {
        int n = 4;
        int fact=1;
        calculeazafactorial(n);

        int rez=calculeazafactorial2(n, fact);
        System.out.println(rez);

        int recursiv= fact(n);
        System.out.println(recursiv);
    }

    //varianta recursiva
    private static int fact(int n) {
        if(n<2)
            return 1;
        else return fact(n-1)*n;
    }


    public static int calculeazafactorial2(int n, int fact) {
        fact = fact * n * (n - 1);
            /* if nu face nimic, pentru ca ignori rezultatul functiei. Apare si in intelij un warning. Si chiar daca ai pune un return in fata
            de fapt calculeaza 1*1*2*2*3*3*4*4*5 ( e un factorial la patrat, doar ca lipseste ultimul element.)
             */
            if (n > 2) {
                n = n - 1;
                calculeazafactorial2(n, fact);
            }

            return fact;
    }

    //good
    public static void calculeazafactorial(int n) {
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
