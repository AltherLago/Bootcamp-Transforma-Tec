import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex1{

    public static void main(String[] args){

        cleanConsoleScreen();

        String[] months = {"January", "February", "March", "April", "May", "July"};
        ArrayList<Double> temps = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < months.length; i++){

            System.out.println("What was temperature of " + months[i] + "?");
            temps.add(input.nextDouble());
            System.out.println(temps);

        }
    
        cleanConsoleScreen();
    
        Double average = temps.stream()
            .mapToDouble(Double::floatValue)
            .average()
            .orElse(0d);
        System.out.printf("\nTemperatures Average: %.1f\n\n", average);
        
        System.out.println("Temperatures above average are: \n");
        int i = 0;
        for(Double temp : temps){
            if(temp > average)
                System.out.println(months[i] +  " was temperature equals: " + temp + "\n");
            i++;
        }

        input.close();
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
