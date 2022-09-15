package abstracts;

abstract class BankAccount{

    String owner;
    Double balance;

    public abstract void withdraw();

    public void deposit(){
        System.out.println("Deposit completed");
    }

}

class CheckAccount extends BankAccount{
    @Override
    public void withdraw(){
        System.out.println("Withdraw successful\n");
    }
}

class SavingsAccount extends BankAccount{
    @Override
    public void withdraw(){
        System.out.println("Withdraw successful on SavingsAccount\n");
    }
}

public class BankAccounts{

    public static void main(String[] args){

        cleanConsoleScreen();

        CheckAccount checkAccount = new CheckAccount();
        checkAccount.deposit();
        checkAccount.withdraw();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit();
        savingsAccount.withdraw();

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}


