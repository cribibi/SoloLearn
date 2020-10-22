package exercises;

//94. Calculat factorial de n
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact=1;
        calculeazafactorial(n);

        int rez=calculeazafactorial2(n, fact);
        System.out.println(rez);
    }

    public static int calculeazafactorial2(int n, int fact) {
        fact = fact * n * (n - 1);
            if (n > 2) {
                n = n - 1;
                calculeazafactorial2(n, fact);
            }

            return fact;
    }

    public static void calculeazafactorial(int n) {
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
