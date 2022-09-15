package modifiers;

import scopes.Car;

public class StoredCar extends Car{

    public StoredCar(String model,
                     Integer year){

        super(model,
              year);

    }

    public static void main(String[] args){

        cleanConsoleScreen();

        StoredCar sCar = new StoredCar("Marea Bomb", 2000);
        System.out.println(sCar.year);
       // System.out.println(getModel());

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}

