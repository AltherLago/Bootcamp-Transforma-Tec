package list;

import java.util.*;

public class LinkedHashSet01{

    public static void main(String[] args){

        cleanConsoleScreen();

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(); 

        numbers.add(7);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);

        System.out.println(numbers + "\n");

        Iterator<Integer> numbersIterator = numbers.iterator();

        System.out.println(numbersIterator + "\n");

        while(numbersIterator.hasNext()){
            System.out.println(numbersIterator.next());
        };
        

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
