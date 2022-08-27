import javax.swing.*;
import java.io.*;

public class CheckedException { 

    public static void main(String[] args){

        cleanConsoleScreen();

        String fileName = "romances-blake-crouch.txt"; 

        try{
            filePrint(fileName);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Review file name. " + e.getCause());
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,
                    "Unexpected error. Contact suport! " + e.getCause());
        } finally {
            System.out.println("\nFinaly");
        }
    }

    public static void filePrint(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
