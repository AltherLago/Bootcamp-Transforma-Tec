package set;

import java.util.*;

public class HashSet01{

    public static void main(String[] args){

        cleanConsoleScreen();

        Set<Integer> numbers01 = new HashSet<>();

        numbers01.add(1);
        numbers01.add(2);
        numbers01.add(3);
        numbers01.add(4);
        numbers01.add(4);

        System.out.println(numbers01 + "\n");

        // union with 2 sets(conjuntos)
        Set<Integer> numbers02 = new HashSet<>();
        numbers02.addAll(numbers01);
        System.out.println(numbers02 + "\n");
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
