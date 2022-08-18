import java.util.Map;
import java.util.HashMap;

public class Map01{

    public static void main(String[] args){

        cleanConsoleScreen();

        HashMap<String, Integer> agesMap = new HashMap<>();
        agesMap.put("a", 50);
        agesMap.put("b", 40);
        agesMap.put("c", 30);
        System.out.println(agesMap + "\n");

        System.out.println("Element 'c': " + agesMap.get("c") + "\n");

        System.out.println("Iterating the MAP");
        for(Map.Entry<String, Integer> age : agesMap.entrySet())
            System.out.println(age.getKey() + ": " + age.getValue());
        
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
