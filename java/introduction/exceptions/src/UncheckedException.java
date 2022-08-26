import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args){

        cleanConsoleScreen();

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerator: ");
            String b = JOptionPane.showInputDialog("Denominator: ");
            try{
                int result = division(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + result);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " Invalid input, enter a integer! " + e.getMessage());
            } catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossible to divide by 0.");
            }
            finally {
                System.out.println("Finish");
            }
        } while(continueLooping);
    }

    public static int division(int a, int b){
        return a / b;
    }
    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
