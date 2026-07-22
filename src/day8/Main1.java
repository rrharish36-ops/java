import java.util.Scanner;

class ATM {
    protected double balance = 1000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SBIATM extends ATM {
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SBIATM atm = new SBIATM();

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount: ");
                atm.deposit(sc.nextDouble());
                break;

            case 2:
                System.out.print("Enter amount: ");
                atm.withdraw(sc.nextDouble());
                break;

            case 3:
                atm.checkBalance();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
