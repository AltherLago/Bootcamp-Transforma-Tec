package classes;

public class CarCustom{

    static Car car = new Car("asdf190",
                             "Saveiro Monstra",
                             "VW",
                             1998,
                             10);

    public static void main(String[] args){

        System.out.println(car.getLicensePlate());
        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getYear());
        System.out.println(car.getHeight());

        car.getLow(8);
        
        System.out.println(car.getLicensePlate());
        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getYear());
        System.out.println(car.getHeight());

    }
}
