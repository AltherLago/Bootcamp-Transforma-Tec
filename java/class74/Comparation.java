public class Comparation{

    public static void main(String[] args){
        
        cleanConsoleScreen();

        int arr01[] = {1,2,3};
        int arr02[] = {1,2,3};

        if(arr01 == arr02){
            System.out.println("Equals");
        }else{
            System.out.println("Differents");
        }

        System.out.println("");
    }
    
    private static void cleanConsoleScreen() {

        // System.out.print("\033[H\033[2J");
        System.out.print("[H[2J");
        System.out.flush();

    }
}
