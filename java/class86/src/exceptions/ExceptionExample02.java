package exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionExample02 {

    public static void main(String[] args){

        cleanConsoleScreen();

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        list.add("Milk");
        list.add("Bread");
        list.add("Butter");
        list.add("Chease");

        System.out.println("Inform the search item\n");
        String item = scanner.nextLine();

        try{
            if(!list.contains(item)){
                throw new ItemNotFoundException("\n\tThis item isn't in the list\n");
            }else{
                System.out.println("\n\tItem founded\n");
            }
        }catch(ItemNotFoundException ie){
            System.out.println(ie.getMessage());
        }
         
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}

class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(String message){
        super(message);
    }

}

