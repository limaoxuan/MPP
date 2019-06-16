package assignment.prob8;

import assignment.prob8.Trader;
import assignment.prob8.Transaction;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//import static java.util.Comparator.comparing;
//import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
//        Comparator.comparing(x->x.getValue())
        System.out.println("1");
        transactions.stream().filter(o -> o.getYear() >= 2011)
                .sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

//?
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("2");
        transactions.stream().map(x->x.getTrader().getCity()).distinct().forEach(System.out::println);

        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("3");
        transactions.stream().filter(x -> x.getTrader().getCity()
                .equals("Cambridge")).sorted(Comparator.comparing(x -> x.getTrader().getName())).forEach(System.out::println);
        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("4");
        String res = transactions.stream().map(x -> x.getTrader().getName()).sorted().collect(Collectors.joining(" "));
        System.out.println(res);
        // Query 5: Are there any trader based in Milan?
        System.out.println("5");
        boolean milan1 = transactions.stream().anyMatch(x -> x.getTrader().getCity().equals("Milan"));


        if (milan1) {
            System.out.println("There are any trader based in Milan");
        } else {
            System.out.println("There are not any trader based in Milan");
        }
//        milan.ifPresent(x -> System.out.println("There are any trader based in Milan"));

//        Supplier<String > stringSupplier = String::new;
//        milan.orElseGet(stringSupplier);


        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        System.out.println("6");
        transactions.stream().filter(x -> x.getTrader().getCity().equals("Milan")).forEach(x -> x.getTrader().setCity("Cambridge"));
        transactions.stream().forEach(System.out::println);


        // Query 7: What's the highest value in all the transactions?
        System.out.println("7");
        final IntSummaryStatistics collect = transactions.stream().collect(Collectors.summarizingInt(Transaction::getValue));
        System.out.println(collect.getMax());
    }
}
