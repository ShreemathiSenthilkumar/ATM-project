public class Account {
    private int pinNumber, accountNumber;
    private double balance;

    public int getPinNumber() {
        return pinNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Account(int pinNumber, int accountNumber,double balance) {
        this.pinNumber = pinNumber;
        this.accountNumber = accountNumber;
        this.balance=balance;
    }
    public void deposit (double amount){
        balance+=amount;
        System.out.println("Amount deposited");
        System.out.println("Your new balance : "+balance);
    }
    public void withdraw(double amount){
        if(balance>=amount) {
            System.out.println("Amount withdrew");
            balance-=amount;
            System.out.println("Your new balance : "+balance);
        }
        else {
             System.out.println("Insufficient balance");
            }
        }
    }