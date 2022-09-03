import java.util.Scanner;

public class ConverterClient {

    public static void main(String[] args){

        cleanConsoleScreen();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inform value in reais: ");
        Double brValue = Double.parseDouble(scanner.nextLine());

        CurrencyConverter converter = new CurrencyConverter();
        Double convertedAmount = converter.converterBRLtoUSD(brValue);
        System.out.println("Value converted to Dolar: " + convertedAmount + "\n");

        scanner.close();
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
