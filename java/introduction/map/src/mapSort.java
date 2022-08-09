import java.util.*;

public class mapSort{

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("--\tRandom Order--\t");
        Map<String, Book> myBooks = new HashMap<>(){{
            put(" Hawking, Stephen", new Book("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Book("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Book("21 Lições Para o Século 21", 432));

        }};
        for (Map.Entry<String, Book> book : myBooks.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        
        System.out.println("--\tInserction Order--\t");
        Map<String, Book> myBooks1 = new LinkedHashMap<>(){{
            put(" Hawking, Stephen", new Book("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Book("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Book("21 Lições Para o Século 21", 432));

        }};
        for(Map.Entry<String, Book> book : myBooks1.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tName Author Order--\t");
        Map<String, Book> myBooks2 = new TreeMap<>(myBooks1);
        for(Map.Entry<String, Book> book : myBooks2.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tName Books Order--\t");
        Set<Map.Entry<String, Book>> myBooks3 = new TreeSet<>(new NameComparator());
        myBooks3.addAll(myBooks.entrySet());
        for(Map.Entry<String, Book> book : myBooks3)
           System.out.println(book.getKey() + " - " + book.getValue().getName());

   }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}   

class Book{

    private String name;
    private Integer pages;

    public Book(String name, Integer pages){

        this.name = name;
        this.pages = pages;

    }

    public String getName(){
        
        return name;

    }

    public Integer getPages(){

        return pages;

    }

    public boolean equals(Object o){

        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && pages.equals(book.pages);
    }

    public int hashCode(){

        return Objects.hash(name, pages);

    }

    public String toString(){

        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';

    }
}

class NameComparator implements Comparator<Map.Entry<String, Book>>{

    public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2){
        return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
    } 
}
