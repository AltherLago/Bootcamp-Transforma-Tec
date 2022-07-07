public class ListPersons{

    public static void main(String[] args){

        cleanConsoleScreen();

        String persons[] = {"John", "Mary", "James"};

        int i = 0;
        do{

            if(i > persons.length){

                System.out.println("Invalid index");
                break;
            }

            System.out.println(persons[i]);
            i++;

        }while(i < persons.length);

    
        for(i = 0; i < persons.length; i++){
            
            if(i == 1) continue;

            System.out.println(persons[i]);
        }

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
