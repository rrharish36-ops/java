import java.util.Scanner;

public class findTheDifference{

    public static char findTheDifference(String s, String t) {
        int result = 0;

        for (char c : s.toCharArray())
            result ^= c;

        for (char c : t.toCharArray())
            result ^= c;

        return (char) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(findTheDifference(s, t));
    }
}