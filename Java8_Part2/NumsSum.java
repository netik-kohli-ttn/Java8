import java.util.*;

public class NumsSum {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(20);
        num.add(2);
        num.add(15);
        num.add(10);

        int reslt = num.stream().filter(e -> e > 5).mapToInt(Integer::valueOf).sum();

        System.out.println(reslt);
    }
}
