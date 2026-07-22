import java.util.Scanner;

public class smallestNumber{

    public static int smallestNumber(int n) {
        int ans = 1;
        while (ans < n) {
            ans = (ans << 1) | 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(smallestNumber(n));
    }
}