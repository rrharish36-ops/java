import java.util.Scanner;

public class findDuplicate {

    public static int findDuplicate(int[] nums) {
        boolean[] seen = new boolean[nums.length];

        for (int num : nums) {
            if (seen[num])
                return num;
            seen[num] = true;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println(findDuplicate(nums));
    }
}