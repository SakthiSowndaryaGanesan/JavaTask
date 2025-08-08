package Practice_Program;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " - Age: " + age;
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30),
            new Employee("Bob", 25),
            new Employee("Charlie", 28)
        );

        employees.stream()
            .sorted(Comparator.comparingInt(Employee::getAge).reversed()) 
            .limit(1)
            .forEach(e -> System.out.println(e.name));
    }
}
