package streams;

import java.util.*;

public class NoStream {

    public static void main(String[] args){

        cleanConsoleScreen();

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(23);
        numbers.add(13);
        numbers.add(2);
        numbers.add(99);

        for(int i = 0; i < 5; i++){
            Integer number = numbers.get(i);

            if(number % 2 == 0){
                System.out.println(number);
            }
        }

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
