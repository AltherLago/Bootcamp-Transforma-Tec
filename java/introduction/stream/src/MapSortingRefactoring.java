import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class MapSortingRefactoring{

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("--\tRandom Sort--\t");
        Map<Integer, Contact> agenda = new HashMap<>(){{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 3111));
            put(3, new Contact("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contact> entry: agenda.entrySet()) {
                    System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("--\tInserction Sort--\t");
        Map<Integer, Contact> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        System.out.println(agenda1);

        
        System.out.println("--\tId Order--\t");
        Map<Integer, Contact> agenda2 = new TreeMap<>(){{
            put(1, new Contact("Simba", 5555));
            put(4, new Contact("Cami", 1111));
            put(3, new Contact("Jon", 2222));
        }};
        System.out.println(agenda2);

        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
        @Override
        public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
            return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });*/

        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer, Contato>, Integer>() {
                @Override
                public Integer apply(Map.Entry<Integer, Contato> cont) {
                    return cont.getValue().getNumero();
                }
            }));*/

        System.out.println("--\tNumber Order--\t");
        Set<Map.Entry<Integer, Contact>> agendaNumber = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumber()));
        agendaNumber.addAll(agenda.entrySet());
        System.out.println(agendaNumber);

        System.out.println("--\tName Order--\t");
        Set<Map.Entry<Integer, Contact>> agendaName = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getName()));
        agendaName.addAll(agenda.entrySet());
        System.out.println(agendaName);

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
