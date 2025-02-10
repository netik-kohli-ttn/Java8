package ExerciseQu1;

interface Checker{
    boolean check(int a, int b);
}

interface Incrementer{
    int increment(int a);
}

interface Concat{
    String concat(String str1, String str2);
}

interface Upper{
    String upper(String s);
}

public class Exercise1Part1 {
    public static void main(String[] args) {
        Checker checking = (a, b) -> a > b;
        System.out.println(checking.check(7, 5));

        Incrementer increment = x -> x + 1;
        System.out.println(increment.increment(2));

        Concat concat = (str1, str2) -> str1 + str2;
        System.out.println(concat.concat("Netik ", "Kohli"));

        Upper upper = (str) -> str.toUpperCase();
        System.out.println(upper.upper("To The New"));
    }
}
