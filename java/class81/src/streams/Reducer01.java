package streams;

import java.util.Arrays;
import java.util.List;

public class Reducer01 {

    public static void main(String[] args){

        cleanConsoleScreen();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer result = 0;

        for(Integer number : numbers){
            result = result + number;
        }

        System.out.println("Sum without stream: " + result + "\n");
        
        Integer resultStream = numbers.stream()
            .reduce(0, (sum, number) -> sum + number);

        System.out.println("Sum with reduce: " + resultStream + "\n");

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");

        String resultString = letters.stream()
            .reduce("", (part, letter) -> part + letter);

        System.out.println(resultString + "\n");

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
