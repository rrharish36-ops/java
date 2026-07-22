import java.util.Scanner;

public class kitemsWithMaximumSum{

    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes)
            return k;
        if (k <= numOnes + numZeros)
            return numOnes;
        return numOnes - (k - numOnes - numZeros);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOnes = sc.nextInt();
        int numZeros = sc.nextInt();
        int numNegOnes = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k));
    }
}