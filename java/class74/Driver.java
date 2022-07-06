import java.util.Scanner;

public class Driver{

    public static void main(String[] args){

        cleanConsoleScreen();

        Scanner scann = new Scanner(System.in);

        int age = scann.nextInt();

        String name = scann.nextLine();

        if(age < 18){
            System.out.println("Can´t driver");
        }else if(age > 18 && age < 21){
            System.out.println("Carteira provisória");
        }else{
            System.out.println("Can driver");
        }
    }

    public static void cleanConsoleScreen(){
        System.out.print("[H[2J");
        System.out.flush();
    }

}
