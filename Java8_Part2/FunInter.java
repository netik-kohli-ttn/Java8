import java.util.*;
import java.util.function.*;
public class FunInter {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(14);
        lst.add(32);
        lst.add(43);

        Consumer<List<Integer>> c = l -> l.stream().forEach(System.out::println);
        c.accept(lst);

        Predicate<Integer> neg = val -> val < 0;
        neg.test(2);

        Function<Integer, Integer> add = e -> e + e;
        System.out.println(add.apply(5));

        Supplier<String> s = ()-> "Hello, Netik Kohli";
        System.out.println(s.get());
    }
}
