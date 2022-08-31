public class ArithmeticExceptionExample{

    public static void main(String[] args){

        cleanConsoleScreen();

        int a = 10; 
        int b = 0; 

        division(a,b);

    }

    static void division(int a,
                         int b) throws ArithmeticException {

        if(b == 0)
            throw new ArithmeticException("Division by zero\n");

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
