import java.util.Scanner;

public class findNumbers{

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = String.valueOf(num).length();
            if (digits % 2 == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println(findNumbers(nums));
    }
}
