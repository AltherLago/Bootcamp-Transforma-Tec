import java.util.Scanner;
import java.util.Arrays;

public class GetItem2{

    public static void main(String[] args){

        cleanConsoleScreen();

        String names[] = {"Maria", "Joao", "Jose"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell me your name:");
        
        String name = scanner.nextLine();

        if(Arrays.asList(names).contains(name)){
            System.out.println("Name finded");
        }else{
            System.out.println("Name isn´t finded");
        }

        scanner.close();
        
    }

    public static void cleanConsoleScreen(){
        System.out.print("[H[2J");
        System.out.flush();
    }

}
