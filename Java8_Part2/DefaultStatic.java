interface Circle{
    default double getArea(int radius){
        return Math.PI * radius * radius;
    }

    static double getCircumference(int radius){
        return 2 * Math.PI * radius;
    }
}
public class DefaultStatic implements Circle{
    public static void main(String[] args) {
         DefaultStatic ds = new DefaultStatic();
         double res = ds.getArea(8);
         System.out.println(res);

         System.out.println(Circle.getCircumference(12));
    }
}
