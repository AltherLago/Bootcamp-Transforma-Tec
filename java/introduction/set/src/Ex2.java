import java.util.*;

public class Ex2{

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("-----\tInserction Order\t-----\n");
        Set<FavoriteLanguage> myFavoriteLanguages = new LinkedHashSet<>(
                Arrays.asList(
                    new FavoriteLanguage("Python", 1991, "Pycharm"),
                    new FavoriteLanguage("JavaScript", 1995, "IntelliJ"),
                    new FavoriteLanguage("Java", 1992, "Visual Studio Code"),
                    new FavoriteLanguage("Javaa", 1991, "Visual Studio Code")
                    )
        );
        System.out.println(myFavoriteLanguages.toString());
        
        System.out.println("-----\tName Order\t-----\n");
        Set<FavoriteLanguage> nameOrder = new TreeSet<>(myFavoriteLanguages);
        System.out.println(nameOrder.toString());

        System.out.println("-----\tIde Order\t-----\n");
        Set<FavoriteLanguage> ideOrder = new TreeSet<>(new IdeComparator()); 
        ideOrder.addAll(nameOrder);
        System.out.println(ideOrder.toString());

        System.out.println("-----\tYear Order\t-----\n");
        Set<FavoriteLanguage> yearNameOrder = new TreeSet<FavoriteLanguage>(new YearNameComparator());
        yearNameOrder.addAll(myFavoriteLanguages);
        System.out.println(yearNameOrder.toString());


        System.out.println("-----\tName Year Ide Order\t-----\n");
        Set<FavoriteLanguage> nameYearIdeOder = new TreeSet<>(new NameYearIdeComparator());
        nameYearIdeOder.addAll(myFavoriteLanguages);
        System.out.println(nameYearIdeOder.toString());
        
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}

class FavoriteLanguage implements Comparable<FavoriteLanguage>{

    public String name;
    public Integer year;
    public String ide;

    public FavoriteLanguage(String name, Integer year, String ide){
        this.name = name;
        this.year = year;
        this.ide = ide;
    }
    
    public String toString() {
        return "{" +
                "nome='" + name + '\'' +
                ", anoDeCriacao=" + year +
                ", ide='" + ide + '\'' +  
                '}' + "\n";
    }

    public int compareTo(FavoriteLanguage favoriteLanguage){
        return this.name.compareTo(favoriteLanguage.name);
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteLanguage that = (FavoriteLanguage) o;
        return name.equals(that.name);
    }
    
    public int hashCode(){
        return Objects.hash(name);
    }

}

class IdeComparator implements Comparator<FavoriteLanguage>{

    public int compare(FavoriteLanguage fl1, FavoriteLanguage fl2){
        return fl1.ide.compareToIgnoreCase(fl2.ide);
    }

}

class YearNameComparator implements Comparator<FavoriteLanguage>{

    public int compare(FavoriteLanguage fl1, FavoriteLanguage fl2){
        int year = Integer.compare(fl1.year, fl2.year);
        if(year != 0) return year;
        return fl1.name.compareToIgnoreCase(fl2.name);
    }
}

class NameYearIdeComparator implements Comparator<FavoriteLanguage>{

    public int compare(FavoriteLanguage fl1, FavoriteLanguage fl2){
        int name = fl1.name.compareToIgnoreCase(fl2.name);
        int yearCompare = Integer.compare(fl1.year, fl2.year);
        if(name != 0) return name;
        if(yearCompare != 0) return yearCompare;
        return fl1.ide.compareToIgnoreCase(fl2.ide);
    }

}
