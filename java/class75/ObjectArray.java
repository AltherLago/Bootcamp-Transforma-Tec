class Person {
    
    private static int year = 2018;
    private String name;
    private int age;

    public Person(String name, int age){

        this.name = name;
        this.age = age;

    }

    public void setName(String name){

        this.name = name;

    }

    public void setAge(int Age){

        this.age = age;

    }

    public void display(){

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Year: " + Person.year);

    }

}

public class ObjectArray{

    public static void main(String[] args){

        cleanConsoleScreen();

         Person persons[] = new Person[3];

         persons[0] = new Person("Alther", 26);
         persons[1] = new Person("Caroline", 25);
         persons[2] = new Person("Jerusa", 32);

         for(int i = 0; i < persons.length; i++){

             persons[i].display();
             System.out.println();

         }
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
