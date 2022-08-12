import java.util.*;

public class Ex1{

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("Make a map that lists the states and their populations: ");
        Map<String, Integer> populationState = new HashMap() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populationState + "\n");
        
        System.out.println("Replace the population RN's state for: 3.534.165");
        populationState.put("RN", 3534165);
        System.out.println(populationState + "\n");

        System.out.println("Is PB on map? If not add 'PB - 4.039.277'");
        // Get the iterator over the HashMap
        
        
        Iterator<Map.Entry<String, Integer>> iterator = populationState.entrySet().iterator();
        // flag to store result
        boolean isKeyPresent = false;
        String keyToBeChecked = "PB";
        // Iterator over the HashMap
        while(iterator.hasNext()){
            // Get the entry at this iterator
            Map.Entry<String, Integer> entry = iterator.next();
            // Check if this key is the required key
            if(keyToBeChecked == entry.getKey()){
                isKeyPresent = true;
            }
        }
        System.out.println(isKeyPresent + "\n");
        if(!isKeyPresent){
            populationState.put("PB", 4029277);
        }
        System.out.println(populationState + "\n");
        
        System.out.println("Display PE's population: " +  populationState.get("PE"));

        System.out.println("Display all states and your populations in inserction add: ");
        Map<String, Integer> populationsState1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("PB", 4029277);
            put("RN", 3534265);
        }};
        System.out.println(populationsState1 + "\n");
        
        System.out.println("Display all states and yours popolations in alphabetic order:");
        Map<String, Integer> populationsState2 = new TreeMap<>(populationsState1);
        System.out.println(populationsState2 + "\n");
        
        Collection<Integer> population = populationState.values();
        String stateBiggestPopulation = "";
        String stateSmallerPopulation = "";


        for(Map.Entry<String, Integer> entry : populationState.entrySet()){
            if(entry.getValue().equals(Collections.max(population))){
                stateBiggestPopulation = entry.getKey();
            }
             if(entry.getValue().equals(Collections.min(population))){
                stateSmallerPopulation = entry.getKey();
            }
        }
        System.out.println("Display the state with smaller population: " + stateSmallerPopulation + " " + Collections.min(population) );
        System.out.printf("Display the state with biggest population: (%s) (%d)", stateBiggestPopulation, Collections.max(population));
        System.out.println("\n");


        int sum = 0;
        Iterator<Integer> iterator1 = populationState.values().iterator();
        while(iterator1.hasNext()){
            sum += iterator1.next();
        }
        System.out.println("Display sum of all populations: " + sum);
        
        System.out.println("Remove states with population smaller than 4.000.000" );
        Iterator<Integer> iterator2 = populationState.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next() <= 4000000) {
                iterator2.remove();
            }
        }
        System.out.println(populationState);

        System.out.println("Clean the map: ");
        populationState.clear();
        System.out.println(populationState);
        
        System.out.println("Check if map is clear: " + populationState.isEmpty());

    }
    

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }
    

}
