package interfaces;

interface AnimalActions{

    public void makeSound();

    public void move();

    public default void eat(){
        System.out.println("Eat");
    }

}

class Dog implements AnimalActions{
    
    @Override
    public void makeSound(){
        System.out.println("Auauauauaua");
    }

    @Override
    public void move(){
        System.out.println("Run dog");
    }

}

class Bird implements AnimalActions{

    @Override
    public void makeSound(){
        System.out.println("piupiupiupiu");
    }

    public void move(){
        System.out.println("Fly little bird");
    }

}

public class Animal{

    public static void main(String[] args){

        Dog yellowDog = new Dog();

        yellowDog.makeSound();
        yellowDog.move();

        Bird louro = new Bird();

        louro.makeSound();
        louro.move();
        louro.eat();
    }
}
