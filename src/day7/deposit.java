import java.util.Scanner;

public class deposit {

    static double balance = 1000;

    public static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    withdraw(sc.nextDouble());
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}