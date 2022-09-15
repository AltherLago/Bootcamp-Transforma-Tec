package scopes;

import java.util.ArrayList;
import java.util.List;

public class Garage{

    public static void main(String[] args){

        cleanConsoleScreen();

        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Celtinha", 1999));
        cars.add(new Car("Golzera", 1994));
        cars.add(new Car("Uno da Escada", 2000));

        Car unoEscada = cars.get(2);

        System.out.println(unoEscada.getModel() + "\n");
        System.out.println(unoEscada.getYear() + "\n");

       // Test restriction
       //System.out.println(unoEscada.model);

       System.out.println(unoEscada.year);
         
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
