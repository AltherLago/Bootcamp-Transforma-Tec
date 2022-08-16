import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExercise{

    public static void main(String[] args){

        cleanConsoleScreen();

        List<String> numbersRandom = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");   
        
        System.out.println(numbersRandom);
        numbersRandom.forEach(System.out::println);
        System.out.println();

        System.out.println("Take the 5 first numbers and put inside a set: ");
        Set<String> numbersRandomTop5 = numbersRandom.stream()
            .limit(5)
            .collect(Collectors.toSet());
        System.out.println(numbersRandomTop5);
        System.out.println();
        
        System.out.println("Transform the string list in integer list: ");
        List<Integer> numbersRandomInteger = numbersRandom.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        System.out.println(numbersRandomInteger);
        System.out.println();

        System.out.println("Take numbers bigger than 2 and put inside a list: ");
        List<Integer> listEvenBigger2 = numbersRandom.stream()
            .map(Integer::parseInt)
            .filter(i -> i % 2 == 0 && i > 2)
            .collect(Collectors.toList());
        System.out.println(listEvenBigger2);
        System.out.println();

        System.out.println("Display the average: ");
        numbersRandom.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);
        System.out.println();

        System.out.println("Display list without the 3 firsts numbers: ");
        numbersRandomInteger.stream()
            .skip(3)
            .forEach(System.out::println);
        System.out.println();

        System.out.println("Remove repet numbers, remain: ");
        long countDistinctNumbers = numbersRandomInteger.stream()
            .distinct()
            .count();
        System.out.println(countDistinctNumbers);
        System.out.println();

        System.out.println("Display smaller value: ");
        numbersRandomInteger.stream()
            .mapToInt(Integer::intValue)
            .min()
            .ifPresent(System.out::println);
        System.out.println();

        System.out.println("Display larger value: ");
        numbersRandomInteger.stream()
            .mapToInt(Integer::intValue)
            .max()
            .ifPresent(System.out::println);
        System.out.println();

        System.out.println("Display sum of even numbers: ");
        int sumEvenNumbers = numbersRandomInteger.stream()
            .filter(i -> (i % 2 == 0))
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println(sumEvenNumbers);
        System.out.println();

        List sortNumbers = numbersRandomInteger.stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
        System.out.println(sortNumbers);
        System.out.println();
        
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        //        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> oddX3or5Numbers = numbersRandomInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(oddX3or5Numbers);
        System.out.println();

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
