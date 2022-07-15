import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2{

    public static void main(String[] args){

        cleanConsoleScreen();

        System.out.println("Welcome!  Type [y] for Yes or [n] for Not\n");

        List<String> answers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String yes = "y"; 

        System.out.println("Did you call for victim?"); 
        String answer = input.next();
        // System.out.println(answer);
        if(answer.equals(yes))  answers.add(answer);
        // System.out.println(answers);

        System.out.println("Were you at the crime scene?"); 
        answer = input.next();
        if(answer.equals(yes))  answers.add(answer);

        System.out.println("Did you leave near victim?"); 
        answer = input.next();
        if(answer.equals(yes))  answers.add(answer);

        System.out.println("Did it owe the victim?"); 
        answer = input.next();
        if(answer.equals(yes))  answers.add(answer);

        System.out.println("Did you work with victim?"); 
        answer = input.next();
        if(answer.equals(yes))  answers.add(answer);

        input.close();
        
        System.out.println(answers + " " + answers.size());

        cleanConsoleScreen();

        switch(answers.size()){

            case 2:
                System.out.println("You are SUSPECT");
                break;
            case 3:
            case 4:
                System.out.println("You are ACCOMPLICE");
                break;
            case 5:
                System.out.println("You are KILLER");
                break;
            default:
                System.out.println("You are INOCCENT");
        }
        System.out.println();
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
