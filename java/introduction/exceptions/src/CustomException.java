import javax.swing.*;
import java.io.*;

public class CustomException {

    public static void main(String[] args){

        cleanConsoleScreen();

        String fileName = JOptionPane.showInputDialog("File name: ");

        printFileConsole(fileName);
        System.out.println("With exception or not, software to be continue...");
    }

    public static void printFileConsole(String fileName){
        try{
            BufferedReader br = fileRead(fileName);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }while(line != null);
            bw.flush();
            br.close();
        }catch(ImpossibleOpenFileException e){
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            e.printStackTrace();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,
                    "Error unexpected, please speak with suport." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader fileRead(String fileName) throws ImpossibleOpenFileException{

        File file = new File(fileName);
        try{
            return new BufferedReader(new FileReader(fileName));
        }catch(FileNotFoundException e){
            throw new ImpossibleOpenFileException(file.getName(),
                    file.getPath());
        }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}

class ImpossibleOpenFileException extends Exception{
        
        private String fileName;
        private String directory; 

        public ImpossibleOpenFileException(String fileName, 
                String directory){
            super("The file " + fileName + " isn´t founded " + directory);
            this.fileName = fileName;
            this.directory = directory;
        } 
}

