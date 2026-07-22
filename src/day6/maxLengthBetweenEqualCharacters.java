import java.util.Scanner;

public class maxLengthBetweenEqualCharacters {

    public static int maxLengthBetweenEqualCharacters(String s) {
        int[] first = new int[26];

        for (int i = 0; i < 26; i++)
            first[i] = -1;

        int ans = -1;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (first[index] == -1)
                first[index] = i;
            else
                ans = Math.max(ans, i - first[index] - 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}