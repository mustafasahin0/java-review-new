import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TaskTrader {
    public static void main(String[] args) {

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

        // 1. Find all transactions in the year 2011 and sort them by value(small to high)
        transactions.stream().filter(each -> each.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);

        // 2. What are all the unique cities where the traders work?
        transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().forEach(System.out::println);

        // 3. Find all traders from Cambridge and sort them by name.
        transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity() == "Cambridge").sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);

        // 4. Return a string of all traders’ names sorted alphabetically.
        String result = transactions.stream()
                .map(each -> each.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1 + name2);
        System.out.println(result);

        // 5. Are any traders based in Milan?
        boolean milanBased = transactions.stream()
                .anyMatch(each -> each.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        // 6. Print the values of all transactions from the traders living in Cambridge.
        transactions.stream().filter(each -> each.getTrader().getCity() == "Cambridge").map(Transaction::getValue).forEach(System.out::println);

        // 7. What is the highest value of all the transactions?
        Optional<Integer> maxValues = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(maxValues.get());
        // 8. Find the transaction with the smallest value.
        Optional<Transaction> smValue = transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);

        Optional<Transaction> minTransaction = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        System.out.println(minTransaction.get());
    }
}
