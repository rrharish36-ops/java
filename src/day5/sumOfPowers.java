import java.util.*;

public class sumOfPowers{

    public static int sumOfPower(int[] nums) {
        Arrays.sort(nums);
        long mod = 1000000007;
        long ans = 0;
        long sum = 0;

        for (int x : nums) {
            long val = (long) x * x % mod;
            ans = (ans + val * (x + sum)) % mod;
            sum = (2 * sum + x) % mod;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println(sumOfPower(nums));
    }
}