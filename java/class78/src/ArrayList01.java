import java.util.ArrayList;

public class ArrayList01{

    public static void main(String[] args){

        cleanConsoleScreen();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(500);
        numbers.add(1000);
        numbers.add(2500);
        numbers.add(1500);
        numbers.add(5030);
        System.out.println(numbers);
        System.out.println();

        System.out.println("Item position 4: " + numbers.get(4) + "\n");

        numbers.remove(1);
        System.out.println("ArrayList without position 1: " + numbers + "\n");

        boolean contain = numbers.contains(91500);
        System.out.println("ArrayList contain 91500? " + contain + "\n" );

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
