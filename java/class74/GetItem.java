import java.util.Scanner;

public class GetItem{

    public static void main(String[] args){

        cleanConsoleScreen();

        int numbers[] = {1,2,3,4,5,6};
        int found = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number");

        int number = scanner.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == number){
                found = numbers[i];
            }
        }

        if(found == 0){
            System.out.println("Not finded");
        }else{
            System.out.println("Finded");
        }  

        scanner.close();
    }

    public static void cleanConsoleScreen(){
        System.out.print("[H[2J");
        System.out.flush();
    }

}
