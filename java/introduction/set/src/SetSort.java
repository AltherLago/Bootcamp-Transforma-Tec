import java.util.*;

public class SetSort{

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("--\t Random Sort\t--\n"); 

        Set<Serie> mySeries = new HashSet<>(){{
            add(new Serie("got", "fantasy", 60));
            add(new Serie("dark", "drama", 45));
            add(new Serie("house", "drama", 60));
        }};

        for(Serie serie : mySeries){

            System.out.println(serie.toString() + "\n");

        }

        System.out.println("--\tInserction Order\t--\n");
        Set<Serie> mySeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasy", 60));
            add(new Serie("dark", "drama", 50));
            add(new Serie("house", "drama", 45));
        }};

        for(Serie serie : mySeries1){

            System.out.println(serie.toString() + "\n");

        }

        System.out.println("--\tNatural Order (EpisodeLengh)\t--\n");
        Set<Serie> mySeries2 = new TreeSet<>(mySeries1);
        for (Serie serie: mySeries2) System.out.println(serie.getName() + " - "
                + serie.getGenre() + " - " + serie.getEpisodeLengh());

        System.out.println("--\tGenre Order\t--\n");
        Set<Serie> mySeriesGenre = new TreeSet<>(new ComparatorGenre());
        mySeriesGenre.addAll(mySeries);

        for(Serie serie : mySeriesGenre){

            System.out.println(serie.toString() + "\n");

        }

        System.out.println("--\tOrder Name/Genre/EpisodeLengh\t--\n");
        Set<Serie> mySeries3 = new TreeSet<>(new ComparatorNameGenreEpisodeLengh());
        mySeries3.addAll(mySeries);

        for(Serie serie : mySeries3){

            System.out.println(serie.toString() + "\n");

        }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}

class Serie implements Comparable<Serie>{

    private String name;
    private String genre;
    private Integer EpisodeLengh;

    public Serie(String name, String genre, Integer EpisodeLengh){

        this.name = name;
        this.genre = genre;
        this.EpisodeLengh = EpisodeLengh;

    }

    public String getName(){
        
        return name;

    }

    public String getGenre(){
        
        return genre;

    }

    public Integer getEpisodeLengh(){
        
        return EpisodeLengh;

    }

    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", EpisodeLengh=" + EpisodeLengh +
                '}';
    }

    public boolean equals(Object o){

        if(this == o) return true;
        if(o == null || getClass() != o.getClass())  return false;
        Serie serie = (Serie) o;
        return name.equals(serie.name) && genre.equals(serie.genre) && EpisodeLengh.equals(serie.EpisodeLengh);

    }

    public int hasCode(){

        return Objects.hash(name, genre, EpisodeLengh);

    }

    public int compareTo(Serie serie){

        int EpisodeLengh = Integer.compare(this.getEpisodeLengh(), serie.getEpisodeLengh());
        if(EpisodeLengh != 0) return EpisodeLengh;
        
        return this.getGenre().compareTo(serie.getGenre());
        
    }

}
class ComparatorGenre implements Comparator<Serie>{

    public int compare(Serie s1, Serie s2){

        int genre = s1.getGenre().compareTo(s2.getGenre());
        int equals = 0;
        if(genre != equals) return genre;

        return Integer.compare(s1.getEpisodeLengh(), s2.getEpisodeLengh());

    }   

}

class ComparatorNameGenreEpisodeLengh implements Comparator<Serie>{

    public int compare(Serie s1, Serie s2){

        int name = s1.getName().compareTo(s2.getName());
        int equals = 0;
        if(name != equals) return name;

        int genre = s1.getGenre().compareTo(s2.getGenre());
        if(genre != equals) return genre;

        return Integer.compare(s1.getEpisodeLengh(), s2.getEpisodeLengh());
    }
}

