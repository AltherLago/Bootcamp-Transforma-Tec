import java.util.Scanner;

public class AgesArray{

    public static void main(String[] args){

        cleanConsoleScreen();

        int[] age = new int[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < age.length; i++){
            
            System.out.print("Tell age  " + i + ":");
            age[i] = scanner.nextInt();

        }

        System.out.println();

        for(int a : age){
            
            System.out.println("Age: " + a);

        }
        
        scanner.close();

        System.out.println();

    }

    public static void cleanConsoleScreen(){
        System.out.print("[H[2J");
        System.out.flush();
    }

}
