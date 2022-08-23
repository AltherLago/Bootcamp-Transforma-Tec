package streams;

import java.util.ArrayList;
import java.util.List;

public class Stream01 {

    public static void main(String[] args){

        cleanConsoleScreen();

        List<Integer> numbers = new ArrayList<>(); 

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

        numbers.stream()
            .limit(5)
            .filter((number) -> number % 2 == 0)
            .forEach(System.out::println);

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
