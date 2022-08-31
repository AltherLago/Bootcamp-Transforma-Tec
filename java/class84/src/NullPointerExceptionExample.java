public class NullPointerExceptionExample{

    public static void main(String[] args){

        cleanConsoleScreen();

        Integer number = null;

        if(number > 0){
            System.out.print("Positive");
        }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
