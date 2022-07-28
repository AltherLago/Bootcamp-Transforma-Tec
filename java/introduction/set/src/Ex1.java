import java.util.*;

public class Ex1{

    public static void main(String[] args){

        cleanConsoleScreen();

        Set<String> rainbowColors = new HashSet<>();
        rainbowColors.add("Violet");
        rainbowColors.add("Indigo");
        rainbowColors.add("Blue");
        rainbowColors.add("Green");
        rainbowColors.add("Yellow");
        rainbowColors.add("Orange");
        rainbowColors.add("Red");
        System.out.println(rainbowColors + "\n");

        System.out.println("Display all the colors in the rainbow one below the other:\n");
        for(String color : rainbowColors){
            System.out.println("\t" + color);
        }
        System.out.println();

        System.out.println("The number of colors the rainbow has " + rainbowColors.size() + "\n");

        System.out.println("Display all colors alphabet order: ");
        Set<String> rainbowColorsAlpha = new TreeSet<>(rainbowColors);
        System.out.println("\n" + rainbowColorsAlpha + "\n");
        
        System.out.println("Display all colors in the reverse order of what was entered\n");
        List<String> rainbowColorList = new ArrayList<>(rainbowColors);
        System.out.println("Before: " + rainbowColorList + "\n");
        Collections.reverse(rainbowColorList);
        System.out.println("After: " + rainbowColorList + "\n");

        System.out.println("Display all colors that starting with letter 'v'\n");
        for(String color : rainbowColors){
            if(color.startsWith("V")) System.out.println(color);
        }
        System.out.println();

        System.out.println("Remove all colors that do not start with letter 'v'\n");
        Iterator<String> iterator2 = rainbowColors.iterator(); 
        while(iterator2.hasNext()){
            if(!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(rainbowColors);
        
        System.out.println("Clear Set:");
        rainbowColors.clear();

        System.out.println("Check if the set is empty:" + rainbowColors.isEmpty());
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
