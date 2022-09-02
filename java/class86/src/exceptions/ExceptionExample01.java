package exceptions;

import java.util.Scanner;

public class ExceptionExample01 {

    public static void main(String[] args){

        cleanConsoleScreen();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inform your age: ");
        Integer age = Integer.parseInt(scanner.nextLine());
        
        try{
            if(age < 18){
                throw new AgeExeption("\n\tAge must to be greater or equal 18 years old\n");
            }else{
                System.out.println("\tCan driver!\n");
            }
        }catch(AgeExeption ae){
            System.out.println(ae.getMessage());
        }finally{
            scanner.close();
        }
    }
    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}

class AgeExeption extends Exception{
    
    public AgeExeption(String message){
        super(message);
    }

}

