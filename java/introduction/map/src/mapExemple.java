import java.util.*;

public class mapExemple{

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("Create a dictionary that list models and their respective consumptions:");
        Map<String, Double> popularCars = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(popularCars.toString());
        

        System.out.println("Replace the gol consuption for 15,2 Km/L:");
        popularCars.put("gol", 15.2);
        System.out.println(popularCars);

        System.out.println("Check if tucson model has on map: " + popularCars.containsKey("tucson"));
        
        System.out.println("Show uno consuption: " + popularCars.get("uno"));
        System.out.println("Show models: ");
        Set<String> models = popularCars.keySet();
        System.out.println(models);

        System.out.println("Show consuptions: ");
        Collection<Double> consuptions = popularCars.values();
        System.out.println(consuptions);

        System.out.println("Show the models more economics and your consuptions: ");
        Double moreEficientConsuption = Collections.min(popularCars.values());
        Set<Map.Entry<String, Double>> entries = popularCars.entrySet();
        String moreEficientModel = "";

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(moreEficientConsuption)){
                moreEficientModel = entry.getKey();
                System.out.println("More eficient Model: " + moreEficientModel);
            } 
        }

        System.out.println("Show the models more economics and your consuptions: ");
        Double lessEficientConsuption = Collections.max(popularCars.values());
        String lessEficientModel = "";
        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(lessEficientConsuption)){
                lessEficientModel = entry.getKey();
                System.out.println("Less eficient Model: " + lessEficientModel);
            }
        }

        Iterator<Double> iterator = popularCars.values().iterator();
        Double sum = 0d;
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println("Display consuptions sum: " + sum);

        System.out.println("Display average of consuptions: " + sum/popularCars.size());

        System.out.println(popularCars);
        System.out.println("Remove models with consuptions equals 15.6 Km/L ");
        Iterator<Double> iterator1 = popularCars.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        } 

        System.out.println("Show all cars on inserction order: ");
        Map<String, Double> popularCars1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(popularCars1);
        
        System.out.println("Show map in alfabetic order: ");
        Map<String, Double> popularCars2 = new TreeMap<>(popularCars1);
        System.out.println(popularCars2);

        System.out.println("Clean map cars: ");
        popularCars.clear();

        System.out.println("Check if map is empty: " + popularCars.isEmpty());
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
