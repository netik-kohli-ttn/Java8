interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

public class Exercise3 implements A, B {
    public void show(){
        A.super.show();
        B.super.show();
    }
    public static void main(String[] args) {
        Exercise3 ex = new Exercise3();
        ex.show();
    }
}
