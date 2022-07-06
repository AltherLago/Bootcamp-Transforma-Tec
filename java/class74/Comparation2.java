import java.util.Arrays;

public class Comparation2{

    public static void main(String[] args){

        cleanConsoleScreen();

        int arr01[] = {1,2,3};
        int arr02[] = {1,2,3};

        if(Arrays.equals(arr01, arr02)){
            System.out.println("Equals");
        }else{
            System.out.println("Differs");
        }
    }

    public static void cleanConsoleScreen(){
        System.out.print("[H[2J");
    }

}
