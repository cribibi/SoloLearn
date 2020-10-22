package exercises;

//95. Calculati fibonnaci

public class Fibonnaci {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int sum=0;

        for (int i = 0; i <n-1; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }

        System.out.println(sum);
    }
}
