import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       BankAccount account=new BankAccount(1000); //Default account balance
       ATM atm=new ATM(account);
        Scanner scanner=new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("\t\t*****Welcome to the ATM*****");
            System.out.println("\t1. Withdraw");
            System.out.println("\t2. Deposit");
            System.out.println("\t3. Check Balance");
            System.out.println("\t4. Exit\n\n");

            System.out.println("Choose the operation you wishto do: ");
            choice= scanner.nextInt();


            switch (choice){
                case 1: // Withdrawing
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount=scanner.nextDouble();
                    System.out.println(atm.Withdraw(withdrawAmount));
                    break;
                case 2: // Depositing
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount=scanner.nextDouble();
                    System.out.println("\n"+ atm.deposit(depositAmount)+ "\n");
                    break;
                case 3: // Checking balance
                    System.out.println(atm.checkBalance());
                    break;
                case 4: //Exiting the ATM system
                    System.out.println("Thank you for using the ATM.\n Welcome again!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. try again");

            }
        }

    }
}