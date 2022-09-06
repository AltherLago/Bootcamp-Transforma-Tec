package classes;

public class HandlePerson{

    static Person person = new Person("Alther", 26, "Dev");

    public static void main(String[] args){

        System.out.println(person.getName());
        System.out.println(person.getProfession());

        person.setProfession("speaker");
        System.out.println(person.getProfession());

    }
}
