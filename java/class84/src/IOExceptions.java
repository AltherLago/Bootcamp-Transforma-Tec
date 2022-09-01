import java.io.*;

public class IOExceptions{

    public static void main(String[] args){
    
        cleanConsoleScreen();

        String textLine;

        try(BufferedReader br = new BufferedReader(new FileReader("./files/texto.txt"))){
            while( (textLine = br.readLine()) != null ){
                System.out.println(textLine);
            }    
        }catch(IOException e){
            System.out.println(e);
        }

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
