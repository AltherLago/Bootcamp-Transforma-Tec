import java.util.Scanner;

public class Bingo{

    public static void main(String[] args){

        cleanConsoleScreen();

        int[][] card = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.println("Type value for position: " + i + " " + j);
                card[i][j] = scanner.nextInt();

            }

        }

        scanner.close();

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++) {

                System.out.print(card[i][j] + " ");

            }
            
            System.out.println();
        }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
