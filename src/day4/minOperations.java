import java.util.Scanner;
import java.util.HashSet;

public class  minOperations {

    public static int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] <= k)
                set.add(nums[i]);

            if (set.size() == k)
                return nums.length - i;
        }

        return nums.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(minOperations(nums, k));
    }
}