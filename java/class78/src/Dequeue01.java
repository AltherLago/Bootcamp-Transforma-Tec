import java.util.ArrayDeque;

public class Dequeue01{

    public static void main(String[] args){

        cleanConsoleScreen();

        ArrayDeque<String> cards = new ArrayDeque<>(); 
        cards.add("Ronaldinho");
        cards.add("Ronaldo");
        cards.add("Pele");
        cards.add("Garrincha");

        for(String card : cards)
            System.out.println("Card: " + card + "\n");

        cards.clear();
        System.out.println("Cards: " + cards + "\n");

        System.out.println("Add with first and last");

        cards.addLast("Romario");
        cards.add("Pele");
        cards.add("Neymar");
        cards.addFirst("Ronaldinho");
        System.out.println(cards);

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
