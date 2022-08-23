package streams;

import java.util.*;
import java.util.stream.Stream;

class Product02{

    int id;
    String name;
    Double price;

    //método construtor
    public Product02(int id, String name, Double price) {

        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Stream03{

    public static void main(String[] args){

        cleanConsoleScreen();

        List<Product02> cart = new ArrayList<Product02>();

        cart.add(new Product02(1, "Phone Charger", 200d));
        cart.add(new Product02(2, "Keyboard", 700d));
        cart.add(new Product02(3, "Earphone", 800d));
        cart.add(new Product02(4, "Mouse", 300d));
            
        Stream<Product02> smaller300 = cart.stream()
            .filter(product -> product.price < 300d);

        smaller300.forEach(

                product -> System.out.println(product.id
                    + " - "
                    + product.price)
        );
        System.out.println();

        Stream<Product02> greater300 = cart.stream()
            .filter(product -> product.price > 300d);

        greater300.forEach(

                product -> System.out.println(product.id
                    + " - "
                    + product.price)
        );


    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}



