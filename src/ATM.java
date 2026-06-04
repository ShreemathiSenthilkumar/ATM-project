import java.util.Scanner;
public class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }
    public boolean verifyPin(){
        Scanner myPin = new Scanner(System.in);
        System.out.println("Enter your PIN : ");
        int enteredPin = myPin.nextInt();
        return enteredPin == account.getPinNumber();
    }
    public void displayBalance(){
        System.out.println("Your Balance : "+ account.getBalance());
    }
    public void depositMoney(){
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter your amount : ");
        double enteredamount1 = amount.nextDouble();
        account.deposit(enteredamount1);
    }
    public void withdrawMoney(){
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter your amount : ");
        double enteredamount2 = amount.nextDouble();
        account.withdraw(enteredamount2);
    }

}
