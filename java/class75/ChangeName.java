import java.util.Scanner;

public class ChangeName{

    public static void main(String[] args){

        cleanConsoleScreen();

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Josh", "John", "Noah"};

        for(String n : names){

            System.out.println(n);

        }

        System.out.println("Tell me new name");
        String name = scanner.nextLine();
        
        scanner.close();
        
        names[2] = name;

        for(String n : names){

            System.out.println(n);

        }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
