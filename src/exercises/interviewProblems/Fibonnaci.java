package exercises.deladorin;

//95. Calculati fibonnaci

public class Fibonnaci {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int sum=0;
        //0,1,1,2,3,5,8,13,21,34,55 - e al 11 lea. Ai putea sa incepi de la 2 sa termini la n, pentru ca deja stii primele 2 elemente
        // ai ignorat cazul in care n=1; dar asta se rezolva usor returnand b in loc de sum. Altfel pentru  n=2, iti returneaza 0.
        for (int i = 0; i <n-1; i++) {
            sum=a+b;
            a=b;
            b=sum;
        }

        System.out.println(sum);

        int result = fibonnaci(n);
        System.out.println(result);


        //poti chiar si fara aux,daca in b salvezi suma lor, atunci a ul ca sa fie fostul b trebuie sa fie suma lor -a, deci b-a.
        result = fibonnaci2(n);
        System.out.println(result);
    }

    private static int fibonnaci2(int n) {
        int a = 0;
        int b = 1;
        for(int i=2;i<n;i++){
            b=a+b;
            a=b-a;
        }
        return b;
    }

    private static int fibonnaci(int n) {
        int a = 0;
        int b = 1;
        int aux;
        for(int i=2;i<n;i++){
            aux=a+b;
            a=b;
            b=aux;
        }
        return b;
    }


}
