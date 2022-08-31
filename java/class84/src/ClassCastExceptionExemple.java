import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassCastExceptionExemple{

    public static void main(String[] args){

        cleanConsoleScreen();

        String[] nameArray = new String[] { "John", "Mary" };

        // List<String> nameList = Arrays.asList(nameArray);
        ArrayList<String> nameList = (ArrayList<String>) Arrays.asList(nameArray);
        System.out.println(nameList + "\n");

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
