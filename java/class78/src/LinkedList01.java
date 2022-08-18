import java.util.LinkedList;

public class LinkedList01{

    public static void main(String[] args){

        cleanConsoleScreen();

        LinkedList<String> names = new LinkedList<>(); 

        names.add("Ca");
        names.add("Jo");
        names.add("De");
        names.add("Pa");
        names.add("Ta");

        System.out.println("All names: " + names + "\n");

        for(int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));
        System.out.println();
        
        names.remove(3);
        names.remove("Ca");

        System.out.println("With removeds names: " + names + "\n");

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
