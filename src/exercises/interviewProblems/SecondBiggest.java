package exercises.interviewProblems;

import java.util.ArrayList;
import java.util.List;
// fii atenta la numele pachetelor. Sa coresupunda cu ierarhia de foldere. In anumite exercitii aveai package exercises. Desi ierarhia ta e exercises.deladorin
// fii atenta la numele claselor sa fie acceasi cu numele fisierului in cazul in care clasa e public. Daca clasa nu e publica poate avea si nume diferit decat fisierul.
// fii atenta la numele claselor si metodelor sa fie CamelCase. Nu ai Aldoileacelmaimare ci AlDoileaCelMaiMare.
// numele sa fie sugestive. nu metoda, ci getSecondMax de exemplu. Si in engleza de preferat ca asa o sa fie si in proiect, SecondMax in loc de AlDoileaCelMaiMare.
// Un hint: Numele metodelor sa fie verbe pentru ca metodele inseamna comportament, al claselor si fieldurilor, substantive pentru ca reprezinta starea. Gen ai clasa Card, are fielduri: amount,iban (Card are o suma si un iban), iar metodele sunt: withdraw, validate,approve ( poti scoate bani, poti valida o tranzactie, reprezinta actiuni). Face codul mai usor de citit.
//nu uita gitignore. ai facut commit la fisiere inutile : out, .idea iml.

//93. Gasiti al 2 lea cel mai mare numar dintr-o lista
public class Aldoileacelmaimare {
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
