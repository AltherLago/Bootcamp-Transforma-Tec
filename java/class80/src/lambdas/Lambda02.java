package lambdas;

import java.util.*;

public class Lambda02 {

    public static void main(String[] args){

        cleanConsoleScreen();

        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(45);
        numbers.add(15);
        numbers.add(10);
        numbers.add(20);
        numbers.add(36);
        numbers.add(33);
        numbers.add(44);
        numbers.add(75);

        numbers.forEach(num -> System.out.println(num));

        System.out.println();

        numbers.forEach(
                n -> {
                    if(n % 2 == 0){
                        System.out.println(n);
                    } 
                } 
        );

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
