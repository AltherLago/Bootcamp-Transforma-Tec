import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.util.Scanner;

import java.util.Comparator;

public class ExpenseStream{
    private static List<Expense> expenseList = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        cleanConsoleScreen();

        expenseList.add(new Expense(1, "Agua", 50.00,"Fixa","15072022"));
        expenseList.add(new Expense(2, "Luz", 200.00,"Fixa","16072022"));
        expenseList.add(new Expense(3, "Janta", 150.00,"Extra","17072022"));
        expenseList.add(new Expense(4, "Farmacia", 450.00,"Saude","18072022"));
        expenseList.add(new Expense(5, "Carro", 850.00,"Extra","19072022"));
        expenseList.add(new Expense(6, "Dentista", 450.00,"Saude","20072022"));

        int id = Integer.parseInt(args[0]);
        System.out.println("Details of banks slip " + id + ":\n");

        for(Expense expense : expenseList){
            if(expense.getId() == id){
                System.out.println(expense.toString());
            }
        }

        List<Double> expenseAmountList = expenseList
                                            .stream()
                                            .map(expense -> expense.getAmount())
                                            .collect(Collectors.toList());
        
        System.out.println("\nList of banks slip amount: \n");
        expenseAmountList.forEach(amount -> System.out.println(amount));

        System.out.println("\nTotal amount of expenses: \n");
        Double totalAmount = expenseAmountList
                                .stream()
                                .reduce((double)0,
                                            (subtotal, expenseAmount) -> subtotal + expenseAmount);
        System.out.println("\t" + totalAmount + "\n");

        System.out.println("\nTotal by FIXA expense category " + "\n");
        List<Double> categoryAmountList = expenseList
                                            .stream()
                                            .filter(expense -> expense.getCategory() == "Fixa")
                                            .map(expense -> expense.getAmount())
                                            .collect(Collectors.toList());

        Double categoryAmount = categoryAmountList
                                    .stream()
                                    .reduce((double)0,
                                            (subtotal, expenseAmount) -> subtotal + expenseAmount);
        System.out.println("\t" + categoryAmount + "\n");

        
        Comparator<Expense> comparator = Comparator.comparing(Expense::getAmount);

        System.out.println("Cheapest expense:" + "\n");
        Expense cheaper = expenseList
                            .stream()
                            .min(comparator)
                            .get();
        System.out.println("\t" + cheaper.getName() + "\n");

        System.out.println("Expensive expense:" + "\n");
        Expense expensive = expenseList
                            .stream()
                            .max(comparator)
                            .get();
        System.out.println("\t" + expensive.getName() + "\n");

        System.out.println("Grouped expenses:" + "\n");
        Map<String, List<String>> groupedExpenses = expenseList
                                                    .stream()
                                                    .collect(Collectors.groupingBy(Expense::getCategory,
                                                                                    Collectors.mapping(Expense::getName,
                                                                                                        Collectors.toList())));
        System.out.println("\t" + groupedExpenses + "\n");

        System.out.println("Map expenses" + "\n");
        Map<Integer, String> expenseMap = expenseList
                                            .stream()
                                            .collect(Collectors.toMap(p -> p.getId(),
                                                                        p -> p.getName()));
        System.out.println("\t" + expenseMap + "\n");

    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
