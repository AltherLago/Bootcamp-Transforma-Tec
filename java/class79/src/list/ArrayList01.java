package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01{

    public static void main(String[] args){

        cleanConsoleScreen();

        List<Integer> numbers = new ArrayList<>(3);

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(0);
        numbers.add(9);
        numbers.add(12);
        numbers.add(14);

        System.out.println(numbers + "\n");

        Collections.sort(numbers);
        System.out.println("Sort descending: " + numbers + "\n");

        Collections.reverse(numbers);
        System.out.println("Sort asceding: " + numbers + "\n");

        System.out.println(numbers.get(3) + "\n");

        System.out.println(numbers.remove(2) + "\n");

        System.out.println(numbers + "\n");
        
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
        
