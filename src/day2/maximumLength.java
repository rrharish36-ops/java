import java.util.Scanner;

public class maximumLength {

    public static int maximumLength(String s) {
        int n = s.length();
        int[][] count = new int[26][51];

        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            int j = i;

            while (j < n && s.charAt(j) == ch) {
                j++;
            }

            int len = j - i;

            for (int k = 1; k <= len && k <= 50; k++) {
                count[ch - 'a'][k] += len - k + 1;
            }

            i = j;
        }

        for (int len = 50; len >= 1; len--) {
            for (int c = 0; c < 26; c++) {
                if (count[c][len] >= 3)
                    return len;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(maximumLength(s));
    }
}
