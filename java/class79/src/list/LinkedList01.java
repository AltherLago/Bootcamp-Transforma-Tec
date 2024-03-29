package list;

import java.util.List;
import java.util.LinkedList;

public class LinkedList01{

    public static void main(String[] args){

        cleanConsoleScreen();

        List<Integer> numbers = new LinkedList<Integer>(); 

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(0);
        numbers.add(9);
        numbers.add(12);
        numbers.add(14);

        System.out.println(numbers + "\n");
        System.out.println(numbers.get(4) + "\n");
        System.out.println(numbers.indexOf(0) + "\n");
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
