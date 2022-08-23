package lambdas;

interface Hello{

    void abstractFunction(int i);

    default void normalFunction(){
        System.out.println("Hello world");
    }

}

public class Lambda04 {

    public static void main(String[] args){

        cleanConsoleScreen();

        Hello hello = (int a)  -> System.out.println(2 * a);  

        hello.abstractFunction(5);

        hello.normalFunction();

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
