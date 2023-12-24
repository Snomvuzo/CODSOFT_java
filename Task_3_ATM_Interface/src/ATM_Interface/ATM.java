package ATM_Interface;

import java.util.Scanner;

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.print("Enter withdrawal amount: R");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > 0) {
                    bankAccount.withdraw(withdrawAmount);
                } else {
                    System.out.println("Invalid withdrawal amount.");
                }
                break;
            case 2:
                System.out.print("Enter deposit amount: R");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    bankAccount.deposit(depositAmount);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;
            case 3:
                System.out.println("Current balance: R" + bankAccount.getBalance());
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial account balance: R");
        double initialBalance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);

        while (true) {
            atm.displayMenu();

            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            atm.processOption(option);
        }
    }
}
