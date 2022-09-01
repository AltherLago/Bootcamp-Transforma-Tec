package bank;

import java.util.Scanner;

public class ManageAccount {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("Inform the client name:"); 
        String owner = scanner.nextLine();

        System.out.println("Inform the count number:");
        Integer number = Integer.parseInt(scanner.nextLine());

        System.out.println("Inform the initial count value:");
        Double amount = Double.parseDouble(scanner.nextLine());

        Account account = createAccount(number,
                                        amount,
                                        owner);

        System.out.println("Deposit value:");
        Double value = Double.parseDouble(scanner.nextLine());

        account.deposit(value);

        System.out.println("\nCurrent balance: " + account.getAmount());

    }

    public static Account createAccount(Integer number,
                                        Double amount,
                                        String owner) throws IllegalArgumentException {

        if(owner.isEmpty() || number == null || amount == null){ 
            throw new IllegalArgumentException("Values null invalids!");
            // don't works and I don't know why...
        }else{
            Account account = new Account(number,
                                          amount,
                                          owner);

            cleanConsoleScreen();
            System.out.println("\nAccount create!!!\n");
            System.out.println("\t" + account.getOwner());
            System.out.println("\t" + account.getNumber());
            System.out.println("\t" + account.getAmount());
            System.out.println();

            return account;

        }    

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
