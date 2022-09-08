package inheritance;

public class CreateVehicle{

    public static void main(String[] args){

        cleanConsoleScreen();

        Car car = new Car("Celtinha",
                          "Chevrolet",
                          "Silver", 
                          1500.00); 

        // Methods inheritance of Vehicle
        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getIsOn());

        //  Methods of class Car
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
        car.turnOnOff();
        System.out.println(car.getIsOn());

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
