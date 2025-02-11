import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String fullName;
    private long salary;
    private String city;

    public Employee(String fullName, long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    void setFullName(String name) {
        fullName = name;
    }
    void setSalary(long sal) {
        salary = sal;
    }
    void setCity(String cty) {
        city = cty;
    }
    String getFullName() {
        return fullName;
    }
    long getSalary() {
        return salary;
    }

    String getCity() {
        return city;
    }

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Netik Kohli", 200000, "Dehradun"));
        emp.add(new Employee("Saurabh Kumar Singh", 30000, "Noida"));
        emp.add(new Employee("Amam Gupta", 2500, "Delhi"));
        emp.add(new Employee("Saurabh Kapoor", 3500, "Delhi"));

        System.out.println(emp.stream().filter(e -> e.getSalary() < 5000 && (e.getCity().equals("Delhi")))
                .map(e -> e.getFullName().split(" ")[0])
                .collect(Collectors.toSet()));
    }
}

