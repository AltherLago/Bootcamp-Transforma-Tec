import javax.swing.*;

public class CustomException02 {

    public static void main(String[] args){

        cleanConsoleScreen();
        
        int[] numerator = {4, 5, 8, 10}; 
        int[] denominator = {2, 4, 0, 2, 8};   

        for(int i=0; i<denominator.length; i++){
            try{
                if(numerator[i] % 2 != 0)
                    throw new NotExactDivisionException("Isn't exact division! ", numerator[i], denominator[i]);

                int result = numerator[i]/denominator[i];
                System.out.println(result);
            }catch(NotExactDivisionException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
