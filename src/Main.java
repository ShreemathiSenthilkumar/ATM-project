import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account account = new Account(1234, 567890, 100000);
        ATM atm = new ATM(account);
        if (atm.verifyPin()) {
            System.out.println("Access allowed ");
            System.out.println("choose your need ");
            Scanner choice = new Scanner(System.in);
            int enter = 0;
            do {
                System.out.println("1. Check Balance ");
                System.out.println("2. Deposit ");
                System.out.println("3. Withdraw ");
                System.out.println("4. Exit");
                enter = choice.nextInt();
                switch (enter) {
                    case 1:
                        atm.displayBalance();
                        break;
                    case 2:
                        atm.depositMoney();
                        break;
                    case 3:
                        atm.withdrawMoney();
                        break;
                    case 4:
                        System.out.println("Thank you for using ATM ");
                        break;
                }
            } while (enter != 4);
        } else {
            System.out.println("deny access");
        }
    }
}