package exercises;

import java.util.ArrayList;
import java.util.List;

//100. Afisati numarul de cuvinte dintr-o lista care au lungime para.
public class Nrdecuv {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bianca");
        list.add("are");
        list.add("gargauni");
        list.add("in");
        list.add("cap");

        int n=numaralitere(list);
        System.out.println(n);

    }


    //good
    public static int numaralitere(List<String> list) {
        int a = 0;
        for (int i = 0; i <list.size() ; i++) {
           if(list.get(i).length()%2==0){
               a=a+1;
           }
        }

        return a;
    }
}
