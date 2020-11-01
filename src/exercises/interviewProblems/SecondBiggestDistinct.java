package exercises.interviewProblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//93. Gasiti al 2 lea cel mai mare numar dintr-o lista
public class AldoileacelmaimareDistincte {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
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
        lista.add(90);
        int c = metoda(lista);
        lista.remove(lista.get(c));



        int d = metoda(lista);
        System.out.println(lista.get(d));


        // putem o lista de numere random  folosind metoda ints. Nu e ceva ce ar trebui la interviu. Dar te ajuta sa nu mai creezi manual listele.
        List<Integer> ints = new Random().ints(30,1,101).boxed().collect(Collectors.toList());
        ints.forEach(i-> System.out.print(i+","));
        System.out.println();
        secondMax(ints);
        //am sortat lista in ordine inversa, ca sa verific rezultatul.
        ints.sort(Comparator.reverseOrder());
        System.out.println(ints.get(1));

    }

    // vrem sa obtinem secondMax sa modificam lista. Si e si mai rapid daca il facem intr-un singur for.
    private static void secondMax(List<Integer> lista) {
        if(lista.size()<2) {
            System.out.println("Lista nu are 2 elemente");
        } else {
            int max = lista.get(0);
            int secondMax = lista.get(0);
            for(int i=2;i<lista.size();i++){
                int current= lista.get(i);
                if(current>max){
                    secondMax=max;
                    max=current;
                } else if(current>secondMax){
                    secondMax=current;
                }
            }
            System.out.println("secondMax "+secondMax);
        }



    }

    public static int metoda(List<Integer> lista) {
        int a = lista.get(0);
        int b = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > a) {
                a = lista.get(i);
                b = i;
            }
        }
        return b;
    }


}
