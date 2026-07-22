import java.util.Scanner;

public class numWaterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            total += newBottles;
            empty = newBottles + (empty % numExchange);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();

        System.out.println(numWaterBottles(numBottles, numExchange));
    }
}