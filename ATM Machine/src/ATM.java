public class ATM {

    private BankAccount account;

    public ATM(BankAccount account){
        this.account=account;
    }

    public String Withdraw(double amount){
        if (amount<=0){
            return "Please enter a valid amount to withdraw!!";
        }else if (amount>account.getBalance()){
            return "Insufficient funds in your account\n"+"Your available balance is:"+account.getBalance();
        }
        else {
            account.setBalance(account.getBalance()-amount);
            return "Withdrawal successful.\n"+"Your new balance is "+account.getBalance();
        }

    }

    public String deposit(double amount){
        if (amount<=0){
            return "Invalid amount. please enter a valid amount to deposit!!";
        }
        else{
            account.setBalance(account.getBalance()+amount);
            return "Deposit successful.\n"+"Your new account balance is "+account.getBalance();
        }
    }

    public String checkBalance(){
        return "Your account balance is "+account.getBalance();
    }


}
