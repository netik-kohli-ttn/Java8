import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface A{
    void show();
}

public class Demo {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s.stream().filter(e -> e % 2==0).collect(Collectors.toList()));
    }
}
