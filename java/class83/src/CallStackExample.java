public class CallStackExample{

    public static Integer sub = 0;
    public static void main(String[] args){

        cleanConsoleScreen();

        Integer a = 10;
        Integer b = 20;

        System.out.println("Start Session of method 'main'\n");

        new CallStackExample().sumNumbers(a, b);

    }

    public void sumNumbers(Integer a,
                             Integer b){
        System.out.println("Start session of method 'sumNumbers'\n");

        System.out.println("Sum of 'a' and 'b': " + (a + b) + "\n");

        multiplyNumbers(a, b);

        System.out.println("Finish session of method 'sumNumbers'\n");
        
    }

    public void multiplyNumbers(Integer a,
                                Integer b){

        System.out.println("Start session of method 'multiplyNumbers'\n");

        System.out.println("Multiply of 'a' and 'b': " + (a * b) + "\n");

        sub = subtractNumbers(a, b);
        System.out.println(sub + "\n");

        System.out.println("Finish session of method 'multiplyNumbers'\n");

    }

    public Integer subtractNumbers(Integer a,
                                    Integer b){

        System.out.println("Start session of method 'subtractNumbers'");
        System.out.println("Subtraction of 'a' and 'b':" + (a-b));
        System.out.println("End session of method 'subtractNumbers'");
        return a - b;

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
