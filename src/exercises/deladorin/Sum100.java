package exercises;

import java.util.*;

//98. Verificati daca exista 2 numere intr-o lista a caror suma este 100.
public class Sum100 {
    public static void main(String[] args) {
        List<Integer> lista =new ArrayList<>();
        lista.add(50);
        lista.add(20);
        lista.add(65);
        lista.add(10);
        lista.add(80);
        lista.add(90);
        lista.add(15);
        lista.add(70);
        lista.add(30);
        lista.add(35);


        for (int i = 0; i <lista.size()-1 ; i++) {
            for (int j = i+1; j <lista.size() ; j++) {
                if (lista.get(i)+lista.get(j)==100){
                    System.out.println(lista.get(i)+" adunat cu "+lista.get(j)+" = 100");
                }

            }

        }
    }
}
