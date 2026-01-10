import java.util.Scanner;

class Bank {

    int accountNumber;
    String accountHolder;
    double balance;

    Bank (int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void DepositeMoney (double money) {
        balance += money;
        System.out.println("Success! " + money + " Deposited ");
        System.out.println();
    }

    public void WithdrawalMoney (double money) {
        balance -= money;
        System.out.println("Success! " + money + " Withdraw");
        System.out.println();
    }

    public void CurrentBalance () {
        System.out.println("Current Balance is : " + balance);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank b1 = new Bank(123,"Shivam", 12000);
        int choice = 1;
        double money;

        do {
            System.out.println("1.Deposite Money\n2.Withdrawal Money\n3.Check Balance\n4.Exists");
            System.out.print("Ente your choice : ");
            choice = input.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter Money : ");
                    money = input.nextDouble();
                    b1.DepositeMoney(money);
                    break;
                case 2:
                    System.out.print("Enter Money for withdrawal : ");
                    money = input.nextDouble();
                    b1.WithdrawalMoney(money);
                    break;
                case 3:
                    b1.CurrentBalance();
                    break;
                case 4:
                    System.out.println("Exists!");
                    return;           
                default:
                    break;
            }
        } while (choice != 4);
            
        
    }
}

