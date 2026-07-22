import java.util.Scanner;

public class bestHand {

    public static String bestHand(int[] ranks, char[] suits) {
        boolean flush = true;

        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[0]) {
                flush = false;
                break;
            }
        }

        if (flush)
            return "Flush";

        int[] count = new int[14];
        int max = 0;

        for (int r : ranks) {
            count[r]++;
            max = Math.max(max, count[r]);
        }

        if (max >= 3)
            return "Three of a Kind";
        if (max == 2)
            return "Pair";

        return "High Card";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ranks = new int[5];
        char[] suits = new char[5];

        for (int i = 0; i < 5; i++)
            ranks[i] = sc.nextInt();

        for (int i = 0; i < 5; i++)
            suits[i] = sc.next().charAt(0);

        System.out.println(bestHand(ranks, suits));
    }
}