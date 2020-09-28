package exercises;

public class Scrabble {
    public static void main(String[] args) {
        String[] words = {"this", "is", "a", "cool", "chAlLenge"};
        int score = 0;
        int maxScore = 0;
        String x = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                score = score + returnValue(String.valueOf(words[i].charAt(j)));
            }
            if (score > maxScore) {
                maxScore = score;
                x = words[i];
            }
            score = 0;
        }
        System.out.println(x);
        System.out.println(maxScore);
    }

    public static int returnValue(String letter) {
        letter=letter.toLowerCase();
        String li1 = "aeiounrtls";
        int l1 = 1;
        String li2 = "dg";
        int l2 = 2;
        String li3 = "bcmp";
        int l3 = 3;
        String li4 = "fhvwy";
        int l4 = 4;
        String li5 = "k";
        int l5 = 5;
        String li6 = "jx";
        int l6 = 8;
        String li7 = "qz";
        int l7 = 10;

        if (li1.contains(letter)) {
            return l1;
        } else if (li2.contains(letter)) {
            return l2;
        } else if (li3.contains(letter)) {
            return l3;
        } else if (li4.contains(letter)) {
            return l4;
        } else if (li5.contains(letter)) {
            return l5;
        } else if (li6.contains(letter)) {
            return l6;
        } else if (li7.contains(letter)) {
            return l7;
        } else return 0;
    }
}
