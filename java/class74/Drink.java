import java.util.Scanner;

public class Drink{

    public static void main(String[] args){

        cleanConsoleScreen();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your old and ID?");

        int age = scanner.nextInt();

        String msg = age < 18 ? "You can´t to go to paty" : "You can to go to paty";

        System.out.println(msg);

        scanner.close();
    }

    public static void cleanConsoleScreen(){
        System.out.print("[H[2J");
        System.out.flush();
    }

}
