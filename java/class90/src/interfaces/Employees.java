package interfaces;

interface Employee{
    public void registerIn(int id);
    public void registerOut(int id);
    public void payExtra();
}

class Manager implements Employee{
    @Override
    public void registerIn(int id){
        System.out.println("Manager entry: " + id + "\n");
    }

    @Override
    public void registerOut(int id){
        System.out.println("Manager exit: " + id + "\n");
    }

    @Override
    public void payExtra(){
        System.out.println("Percentage increase:  1,5%" + "\n");
    }
}

class Driver implements Employee{
    @Override
    public void registerIn(int id){
        System.out.println("Driver entry: " + id + "\n");
    }

    @Override
    public void registerOut(int id){
        System.out.println("Driver exit: " + id + "\n");
    }

    @Override
    public void payExtra(){
        System.out.println("Percentage increase:  1,8%" + "\n");
    }
}


public class Employees{

    public static void main(String[] args){

        cleanConsoleScreen();

        Manager manager = new Manager();
        Driver driver = new Driver();

        manager.registerIn(2);
        manager.registerOut(2);
        manager.payExtra();

        driver.registerIn(4);
        driver.registerOut(4);
        driver.payExtra();
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
