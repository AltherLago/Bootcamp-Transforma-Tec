package map;
import java.util.*;

public class HashMap01 {

    public static void main(String[] args){

        cleanConsoleScreen();

        Map<Integer, String> names = new HashMap<>();  ;;

        names.put(0, "Alther");
        names.put(4, "Cecilia");
        names.put(9, "John");
        names.put(3, "Cazer");
        names.put(1, "Mutorovisk");

        System.out.println(names + "\n");

        System.out.println(names.keySet() + "\n");
        System.out.println(names.values() + "\n");
        System.out.println(names.entrySet() + "\n");

        names.put(1, "Mariana");
        names.putIfAbsent(10, "Joana");
        System.out.println(names + "\n");

        System.err.println(names.remove(9, "Cecilia"));
        System.err.println(names.remove(4, "Cecilia"));


    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
