import java.util.Scanner;

public class CallStack{

    public Integer sumNumbers(Integer n1,
                              Integer n2){
        
        System.out.println("Sum numbers!");

        Integer sum = n1 + n2;

        return sum;
    }

    public static void main(String[] args){

        cleanConsoleScreen();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inform the first number");
        Integer number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Inform the second number");
        Integer number2 = Integer.parseInt(scanner.nextLine());

        scanner.close();

        CallStack callSum = new CallStack();

        Integer sumInteger = callSum.sumNumbers(number1,
                                                number2);

        System.out.println(sumInteger);

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
