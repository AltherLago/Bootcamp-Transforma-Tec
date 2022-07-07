public class ListAges{

    public static void main(String[] args){

        cleanConsoleScreen();

        int ages[] = {18, 20, 19, 34, 12, 18, 22, 23};
    
        int i = 0;
        Boolean m = false;
        
        while(i < ages.length){
            
            System.out.println("Age: " + ages[i]);
            i++;

        }

        i = 0;
        System.out.println();

        while( m == false ){

            System.out.println("Age: " + ages[i]);

            if(ages[i] < 18){
            
                System.out.println("Under Age");
                m = true;

            }

            i++;
        }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
