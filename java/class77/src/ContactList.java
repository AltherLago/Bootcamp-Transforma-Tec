import java.util.Scanner;

class Person{

    String name;
    String phoneNumber;
    String email;

    public Person(String name, String phoneNumber, String email){

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public void setName(String name){

        this.name = name;

    }

    public void setPhoneNumber(String phoneNumber){

        this.phoneNumber = phoneNumber;

    }

    public void setEmail(String email){

        this.email = email;

    }

    public void displayPerson(){

        System.out.println("Name: " + name );
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);

    }
}

public class ContactList{

    public static void main(String[] args){

        cleanConsoleScreen();

        Scanner scanner = new Scanner(System.in);
        Person persons[] = new Person[2];

        System.out.println("Add 2 persons:\n");

        for(int i= 0; i < persons.length; i++){

            System.out.println("Name Person " + i + ":");
            String name = scanner.nextLine();
            
            System.out.println("Phone Person " + i + ":");
            String phoneNumber = scanner.nextLine();
            
            System.out.println("Email Person " + i + ":");
            String email = scanner.nextLine();

            persons[i] = new Person(name, phoneNumber, email);

            System.out.println();
        }

        int option = 1;

        while(option == 1){

            cleanConsoleScreen();

            System.out.println("Persons in your ContactList:\n");

            for(Person person : persons){
                
                person.displayPerson();
                System.out.println();

            }
            System.out.println();

            System.out.println("Are you want change any person?");
            System.out.println("Type 1 for Yes or 0 for No");
            option = scanner.nextInt();
            
            if(option == 1){

                cleanConsoleScreen();
                System.out.println("Tell me person index:");
                int index = scanner.nextInt();

                System.out.println("\nPerson select is: \n");
                persons[index].displayPerson();
                System.out.println();

                scanner = new Scanner(System.in);

                System.out.println("Type new Name Person " + index + ":");
                String name = scanner.nextLine();
                
                System.out.println("Type new Phone Person " + index + ":");
                String phoneNumber = scanner.nextLine();
                
                System.out.println("Type new Email Person " + index + ":");
                String email = scanner.nextLine();

                persons[index] = new Person(name, phoneNumber, email);

            }

        }

        scanner.close();

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
