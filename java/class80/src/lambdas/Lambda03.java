package lambdas;

import java.util.*;

interface Sum{
    int add(int a,
            int b);
}

public class Lambda03 {

    public static void main(String[] args){

        cleanConsoleScreen();

        Sum summer = (a,b) -> (a+b);

        System.out.println(summer.add(50, 60));

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
