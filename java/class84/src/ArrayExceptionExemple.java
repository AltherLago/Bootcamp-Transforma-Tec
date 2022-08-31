import java.util.ArrayList;
import java.util.List;

public class ArrayExceptionExemple {

    public static void main(String[] args){

        cleanConsoleScreen();

         List<String>  names = new ArrayList<String>();

         names.add("Cassio");
         names.add("Cass");
         names.add("Cas");

         getName(names);
    }

    static void getName(List<String> names) throws IndexOutOfBoundsException{

        Integer i = 3;

        if(names.size() <= i)
            throw new IndexOutOfBoundsException("Index out array range <<<<<----\n");
        

        String name = names.get(i);
        System.out.println(name);

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
