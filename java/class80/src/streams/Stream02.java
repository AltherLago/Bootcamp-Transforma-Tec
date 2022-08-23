package streams;

import java.util.*;
import java.util.stream.Stream;

class Product{

    int id;
    String name;
    Double price;

    public Product(int id,
            String name,
            Double price){
        
        super();
        this.id = id;
        this.name = name;
        this.price = price;

    }
}

public class Stream02{

    public static void main(String[] args){

        cleanConsoleScreen();
        
        List<Product> products = new ArrayList<>();
        
        products.add(new Product(1, "Computer Positivo", 0.5));
        products.add(new Product(2, "Smart Phone Broke", 1.5));
        products.add(new Product(3, "Iphone", 10000.5));
        products.add(new Product(4, "USB Cabe", 10.00));
        products.add(new Product(5, "Batery", 200.0));

        Stream<Product> filteredProducts = products.stream()
            .filter(product -> product.price < 150);

        System.out.println();

        filteredProducts.forEach(
                p -> System.out.println(p.name + ": "
                    + p.price 
                    + " id: "
                    + p.id)
        );

         
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
