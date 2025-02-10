class CalcExercise {
    int add(int a, int b ) {
        return a+b;
    }
    int sub(int a, int b ) {
        return a-b;
    }
    static int mult(int a, int b ) {
        return a*b;
    }
}
interface CalcInterface {
    int calculate(int a, int b);
}

public class CalcSimple {
    public static void main(String[] args) {
        CalcExercise exer = new CalcExercise();
        CalcInterface c1 = exer::add;
        System.out.println(c1.calculate(5, 50));
        CalcInterface c2 = exer::sub;
        System.out.println(c2.calculate(70, 30));

        CalcInterface c3 = CalcExercise::mult;
        System.out.println(c3.calculate(5, 50));
    }
}
