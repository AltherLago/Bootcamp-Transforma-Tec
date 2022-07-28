import java.util.*;

public class SetExemple{

    public static void main(String[] args){

        cleanConsoleScreen();

         System.out.println("Build a Set with grades: ");
         Set<Double> grades = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
         System.out.println(grades.toString() + "\n");

         System.out.println("Grade 5.0 contains on HashSet? " + grades.contains(5d) + "\n");

         System.out.println("Less grade: " + Collections.min(grades) + "\n");
         System.out.println("Higther grade: " + Collections.max(grades) + "\n");

         Iterator<Double> iterator = grades.iterator();
         Double sum = 0.0;
         while(iterator.hasNext()){
             Double next = iterator.next();
             sum += next;
         }
        System.out.println("Show sum of grades: " + sum + "\n");
        System.out.println("Show average of grades: " + (sum/grades.size()) + "\n");
        
        System.out.println("Remove grade 0: " + "\n");
        grades.remove(0d);
        System.out.println(grades + "\n");

        System.out.println("Remove grades less than 7: " + "\n");
        Iterator<Double> iterator1 = grades.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(grades + "\n");

        System.out.println("Display all grades in the order were entered: " + "\n");
        Set<Double> grades2 = new LinkedHashSet<>();
        grades2.add(7d);
        grades2.add(8.5);
        grades2.add(9.3);
        grades2.add(5d);
        grades2.add(7d);
        grades2.add(0d);
        grades2.add(3.6);
        System.out.println(grades2);

        System.out.println("Display all grades in asceding order:" + "\n");
        Set<Double> grades3 = new TreeSet<>(grades2);
        System.out.println(grades3 + "\n");

        System.out.println("Clear grades" + "\n");
        grades.clear();
        System.out.println(grades + "\n");
        
         
         
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
