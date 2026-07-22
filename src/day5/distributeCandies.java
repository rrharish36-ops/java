import java.util.Scanner;

public class distributeCandies {

    public static int[] distributeCandies(int candies, int numPeople) {
        int[] result = new int[numPeople];
        int give = 1;
        int i = 0;

        while (candies > 0) {
            result[i % numPeople] += Math.min(give, candies);
            candies -= give;
            give++;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candies = sc.nextInt();
        int numPeople = sc.nextInt();

        int[] ans = distributeCandies(candies, numPeople);

        for (int x : ans)
            System.out.print(x + " ");
    }
}