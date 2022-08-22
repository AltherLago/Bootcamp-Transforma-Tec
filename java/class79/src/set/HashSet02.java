package set;

import java.util.*;

public class HashSet02 {

    public static void main(String[] args){

        cleanConsoleScreen();

        Set<Integer> numbers01 = new HashSet<Integer>();

        numbers01.add(1);
        numbers01.add(2);
        numbers01.add(3);
        numbers01.add(4);
        //não aceita valore repetidos
        numbers01.add(4);

        System.out.println(numbers01);

        Set<Integer> numbers02 = new HashSet<Integer>();

        numbers02.add(7);
        numbers02.add(8);
        numbers02.add(2);
        numbers02.add(4);

        System.out.println(numbers02); 

        // Intersection
        System.out.println(numbers02.retainAll(numbers01));
        System.out.println(numbers02); 
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
