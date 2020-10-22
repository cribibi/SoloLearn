package exercises.deladorin;

import java.util.ArrayList;
import java.util.List;

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
        int c = metoda(lista);
        lista.remove(lista.get(c));

        int d = metoda(lista);
        System.out.println(lista.get(d));

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
