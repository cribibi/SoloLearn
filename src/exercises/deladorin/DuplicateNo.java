package exercises.deladorin;

import java.util.*;

public class DuplicateNo {

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("dati nr de valori n");
//        int n =scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        System.out.println(list);
        List<Integer> indexList = new ArrayList<>();
        indexList.add(1);
        indexList.add(2);
        indexList.add(3);
        indexList.add(4);
        indexList.add(5);
        indexList.add(6);
        //System.out.println("List of indexes+1: " + indexList);
//        ok-dar nu optime
//        returnDuplicateSort(list);
//        returnDuplicate(list);
//        returnDuplicate2(list, indexList);
//        ok
//        returnDuplicateSum(list);
//        returnDuplicateArrayList(list);
//        returnDuplicateWithSet(list);
//        returnDuplicateArray(list);
        returnDuplicateArrayBoolean(list);
    }

    public static void returnDuplicateArray(List list) {
        //in array voi contoriza nr de aparitii al fiecarui element
        //am declarat un array cu lungimea n-1 fata de lista, in array am elemente unice, in lista nu
        int[] array = new int[list.size() - 1];

        //fac un for in care trec prin toate elementele listei
        for (int i = 0; i < list.size(); i++) {
            //incrementez pozitia din array care corespunde cu elementul gasit
            // i=0  list.get(0)=1 --> incrementez array[0]
            // i=1 list.get(1)=5 --> incrementez array[4]
            ++array[(int) list.get(i) - 1];
        }
        //printez array-ul cu numarul de aparitii
        System.out.println("Numarul de aparitii al fiecarui numar: " + Arrays.toString(array));

        //fac un for cu care trec prin toate elementele array-ul
        for (int i = 0; i < array.length; i++) {
            //daca numarul de aparitii e mai mare ca 1
            if (array[i] > 1) {
                //System.out.println("numarul de aparitii mai mare ca 1: "+array[i]);

                //printez valoarea care ii corespunde i+1- [0]-1; [1]-2; [2]-3; [3]-4; [4]-5 etc
                System.out.println(i + 1);
            }
        }
    }

    public static void returnDuplicateArrayBoolean(List list) {
        boolean[] array = new boolean[list.size() - 1];
        //fac un for in care trec prin toate elementele listei
        for (int i = 0; i < list.size(); i++) {
            //daca e false, daca nu l-am gasit deja, il fac true
            if (array[(int) list.get(i) - 1]==false) {
                array[(int) list.get(i) - 1] = true;
            }else{
                //daca e deja true inseamna ca l-am gasit deja si atunci il voi face false la loc
                //indicele array-ului asociat va fi mai mic cu 1 decat valoarea elementului din lista
                array[(int) list.get(i) - 1]=false;
                //vom printa elementul care ii corespunde
                System.out.println("duplicate: "+ (list.get(i)));
            }
        }
    }


    //        faci un array cu numerele ca le stii ca s 1-n si verifici daca e pus deja sau nu
    public static void returnDuplicateArrayList(List list) {
        List<Integer> newList = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i))) {
                newList.add((Integer) list.get(i));
            } else {
                a = (int) list.get(i);
            }
        }
        System.out.println("varianta cu un arraylist: " + a);

    }

    //        te ajuti de un Set sau HashMap
    public static void returnDuplicateWithSet(List list) {
        Set<Object> set = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            if (!set.add(list.get(i))) {
                System.out.println("Varianta cu un set: " + list.get(i));
            }
//            varianta mea mai lunga
//            if (!set.contains(list.get(i))) {
//                set.add(list.get(i));
//            } else {
//                System.out.println("Varianta cu un set: " + list.get(i));
//            }

        }
    }

    public static void returnDuplicateSum(List list) {
        int sum1 = sumOfN(list.size());
        int sum2 = sum(list);

        System.out.println("varianta cu diferenta sumelor " + (sum2 - sum1));
    }

    public static int sum(List list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (int) list.get(i);

        }
        return sum;
    }

    public static int sumOfN(int n) {
        int sum1 = 0;
        for (int i = 1; i < n; i++) {
            sum1 = sum1 + i;
        }
        return sum1;
    }

    public static void returnDuplicate2Lists(List list, List indexList) {
        for (int i = 0; i < indexList.size(); i++) {
            if (list.contains(indexList.get(i))) {
                list.remove(indexList.get(i));
            }
        }
        System.out.println(" and another: " + list);
    }

    public static void returnDuplicateForInFor(List list) {
        int a = 0;
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i - 1) == list.get(j)) {
                    a = (int) list.get(j);
                }
            }
        }
        System.out.println("Another good result: " + a);

    }

    public static void returnDuplicateSort(List list) {
        Collections.sort(list);
        int a = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == list.get(i)) {
                a = (int) list.get(i);
            }
        }
        System.out.println("Good result: " + a);

    }
}
