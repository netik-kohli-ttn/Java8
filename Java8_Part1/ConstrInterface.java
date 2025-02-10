interface InterfaceMy{
    void display(String s);
}

class Human {
   String name;
   public Human(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }
   void setName(String name) {
       this.name = name;
   }
   String getName(String name) {
       return name;
   }
}
public class ConstrInterface {
    public static void main(String[] args) {
         InterfaceMy i = Human::new;
         i.display("Netik kohli");
    }
}
