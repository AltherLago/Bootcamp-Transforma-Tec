import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList{

    public static void main(String[] args){

        cleanConsoleScreen();

        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Jon", 12, "black"));
            add(new Cat("Simba", 6, "tiger"));
            add(new Cat("Jon", 18, "yellow"));
        }};
        myCats.sort(Comparator.comparing(Cat::getName));

        System.out.println("--\tInserction Order\t--\n");
        System.out.println(myCats + "\n");

        System.out.println("--\tRamdom Order\t--\n");
        Collections.shuffle(myCats);
        System.out.println(myCats + "\n");

        System.out.println("--\tNatural Order (name)\t--\n");
        Collections.sort(myCats);
        System.out.println(myCats + "\n");

        System.out.println("--\tAge Order\t--");
        // Collections.sort(myCats, new AgeComparator());
        myCats.sort(new AgeComparator());
        System.out.println(myCats + "\n");
    
        System.out.println("--\tColor Order\t--");
        // Collections.sort(myCats, new ColorComparator());
        myCats.sort(new ColorComparator());
        System.out.println(myCats + "\n");

        System.out.println("--\tName/Age/Color Order\t--");
        Collections.sort(myCats, new NameAgeColorComparator());
        System.out.println(myCats + "\n");
        
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }


}

class Cat implements Comparable<Cat>{

    private String name;
    private Integer age;
    private String color;

    public Cat(String name, Integer age, String color){

        this.name = name;
        this.age = age;
        this.color = color;

    }

    public String getName(){

        return name;

    }

    public Integer getAge(){

        return age;

    }

    public String getColor(){

        return color;

    }

    public String toString(){

            return "{" +
            "nome='" + name+ '\'' +
            ", idade=" + age +
            ", cor='" + color + '\'' +
            '}';

    }

    @Override // interface
    public int compareTo(Cat cat) {
        
        return this.getName().compareToIgnoreCase(cat.getName());
    }

} 

class AgeComparator implements Comparator<Cat> {

    public int compare(Cat c1, Cat c2){

        return Integer.compare(c1.getAge(), c2.getAge());

    }
}

class ColorComparator implements Comparator<Cat>{ 

    public int compare(Cat c1, Cat c2){

        return c1.getColor().compareToIgnoreCase(c2.getColor());

    }
}

class NameAgeColorComparator implements Comparator<Cat>{

    public int compare(Cat c1, Cat c2){

        int name = c1.getName().compareToIgnoreCase(c2.getName());
        if (name != 0) return name;

        int color = c1.getColor().compareToIgnoreCase(c2.getColor());
        if (color != 0) return color;

        return Integer.compare(c1.getAge(), c2.getAge());

    }
}
