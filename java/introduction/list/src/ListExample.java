import java.util.*;

public class ListExample{

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("List with 7 tests notes");

        List<Double> notes = new ArrayList<Double>();

        notes.add(7.0);
        notes.add(8.5);
        notes.add(9.3);
        notes.add(5.0);
        notes.add(7.0);
        notes.add(0.0);
        notes.add(3.6);
        
        System.out.println(notes.toString() + "\n");

        System.out.println("Show the position of note 5.0: " + notes.indexOf(5d) + "\n");

        System.out.println("Add note 8.0 in position 4 on the List:");
        notes.add(4, 8d);
        System.out.println(notes.toString() + "\n");

        System.out.println("Replace note 5.0 for note 6.0:");
        System.out.println(notes + "\n");

        System.out.println("Check note 5.0 on List: " + notes.contains(5d) + "\n");

        System.out.println("Display third note: " + notes.get(2) + "\n");

        System.out.println("Show lower grade: " + Collections.min(notes) + "\n");
        System.out.println("Show higher grade: " + Collections.max(notes) + "\n");

        Iterator<Double> iterator = notes.iterator();
        Double sum = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.println("Show sum of notes: " + sum + "\n");
       
        System.out.println("Show notes average: " + sum/notes.size() + "\n");
        System.out.println("Remove note 0: ");
        notes.remove(0d);
        System.out.println(notes + "\n");

        // System.out.println("Remove notes less than 7:");
        // Iterator<Double> iterator1 = notes.iterator();
        // while(iterator1.hasNext()){
            // Double next = iterator1.next();
            // if(next < 7) iterator1.remove();
        // }
        // System.out.println(notes);

        // System.out.println("Clear all list");
        // if(!notes.isEmpty()) notes.clear();
        // System.out.println(notes + "\n");

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        List<Double> notes2 = new ArrayList<Double>(notes);
        System.out.println(notes + "\n");
 
        // List<Double> notes = new ArrayList<Double>();

   
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
