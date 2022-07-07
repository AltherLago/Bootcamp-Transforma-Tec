public class ListGrades{

    public static void main(String[] args){

        cleanConsoleScreen();

        double grades[] = {50, 60, 40, 80, 20, 100, 50, 100};

        double total = 0, average = 0;

        for(int i = 0; i < grades.length; i++){

            System.out.println("Test " + i + ": " + grades[i]);
            total += grades[i];
            System.out.println("Partial total: " + total);

        }

        average = total/(grades.length);
        System.out.println("Average: " + average + "\n");
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
