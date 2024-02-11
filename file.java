import java.util.Scanner;

class details {
    private int Balance = 10000;
    private String AccountDetails = "3RtGh";

    public int getBalance() {
        return Balance;
    }

    public String getDets() {
        return AccountDetails;
    }

    public int depositMoney(int Amount) {
        Balance += Amount;
        return Balance;
    }

    public int withdrawMoney(int Amount) {
        Balance -= Amount;
        return Balance;
    }

}

public class file {
    public static void main(String[] args) {
        details obj = new details();
        int Amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our bank's online inquiry system");
        System.out.println("We can show you your account details or bank balance");
        int input;
        do {
            showMenu();
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Your account number is " + obj.getDets());
                    break;

                case 2:
                    System.out.println("You have " + obj.getBalance() + " Rs in your account.");
                    break;

                case 3:
                    System.out.println("Enter the amount to be deposited: ");
                    Amount = sc.nextInt();
                    System.out.println("Deposited Succesfully. Your current balance is " + obj.depositMoney(Amount));
                    break;

                case 4:
                    System.out.println("Enter the amount to be Withdrawn: ");
                    Amount = sc.nextInt();
                    if (Amount <= obj.getBalance()) {
                        System.out
                                .println("Deposited Succesfully. Your current balance is " + obj.withdrawMoney(Amount));
                        break;
                    } else {
                        System.out.println("Insufficient Funds.");
                        break;
                    }

                case 0:
                    System.out.println("Thank you for using our service.");
                    break;

                default:
                    System.out.println("Please enter valid inputs.");
                    break;
            }

        } while (input != 0);
        sc.close();
        System.out.println("Until we meet again.");

    }

    private static void showMenu() {
        System.out.println("Type 1 for account details.");
        System.out.println("Type 2 for account balance.");
        System.out.println("Type 3 to deposite money.");
        System.out.println("Type 4 to withdraw money.");
        System.out.println("Type 0 to exxit the system.");
    }
}
