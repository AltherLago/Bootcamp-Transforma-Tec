public class InviteList{

    public static void main(String[] args){

        cleanConsoleScreen();

        String[] persons = {"Jonh", "Joshua", "Zepelin", "Gabriela"};

        for(int i = 0; i < persons.length; i++){

            System.out.println(persons[i]);

        }
        System.out.println();

        int i = 0;
        for(String person : persons){

            System.out.println(i + " " + person);
            i++;
        }
        System.out.println();
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
