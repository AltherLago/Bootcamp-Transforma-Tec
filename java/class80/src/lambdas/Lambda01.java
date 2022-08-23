package lambdas;

import java.util.*;

public class Lambda01 {

    public static void main(String[] args){

        cleanConsoleScreen();

        List<String> names = new ArrayList<>(); 

        names.add("José");
        names.add("Josué");
        names.add("Joseph");
        names.add("Josefo");

        names.forEach(
                (n) -> System.out.println(n) 
        );

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
;