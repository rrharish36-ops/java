import java.util.Scanner;

public class isPrime {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            if (isPrime(bits))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(countPrimeSetBits(left, right));
    }
}
