package products;

// import products.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductStream {



    public static void main(String[] args){

        cleanConsoleScreen();

        List <Product> productsList = new ArrayList<>(); 
        
        productsList.add(new Product(01,"SmartPhone",5000.00));
        productsList.add(new Product(02,"Computer",15000.00));
        productsList.add(new Product(03,"Mouse",500.00));
        productsList.add(new Product(04,"Keyboard",1000.00));
        productsList.add(new Product(05,"Headset",1500.00));
        productsList.add(new Product(06,"Mouse Pad",50.00));
        productsList.add(new Product(07,"Headphone",150.00));

        List<Double> priceList = productsList.stream()
        .filter(product -> product.getPrice() <= 750.00)
        .map(product -> product.getPrice())
        // .toList(); // don't work...
        .collect(Collectors.toList());
        // System.out.println(); // if put together print
            
        priceList.forEach(price -> System.out.println(price));
        System.out.println();
        
        List<Product> productsLess750 = productsList.stream()
            .filter(product -> product.getPrice() <= 750d)
            .map(product -> product)
            // .toList();
            .collect(Collectors.toList());

        productsLess750.forEach(product -> System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice()));
        System.out.println();

        Product maxProduct = productsList.stream()
            .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

        System.out.println("Greater Price: " + 
                maxProduct.getId() + 
                " " +
                maxProduct.getName() +
                " " +
                maxProduct.getPrice() + 
                "\n");


        Map<Integer, String> productsMap = productsList.stream()
            .collect(Collectors.toMap(product -> product.getId(), product -> product.getName()));

        System.out.println(productsMap);

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
