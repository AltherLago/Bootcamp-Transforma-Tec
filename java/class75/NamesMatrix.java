public class NamesMatrix{

    public static void main(String[] args){

        cleanConsoleScreen();

        String names[][] = {{"Cassio", "Caio"}, {"Marcos", "John"}};
        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 2; j++){

                System.out.println("Name [" + i + "-" + j + "]: " + names[i][j]);
            }

        }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
