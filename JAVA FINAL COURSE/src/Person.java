import java.util.ArrayList;
import java.util.List;

// Base class Person
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class Employee that inherits from Person
class Employee extends Person {
    protected String position;

    public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }


    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Position: " + position);
    }
}

// Derived class Manager that inherits from Employee
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, String position, int teamSize) {
        super(name, age, position);
        this.teamSize = teamSize;
    }


    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Position: " + position + ", Team Size: " + teamSize);
    }
}

// Main class to demonstrate the implementation
 class Main {
    public static void main(String[] args) {
        // Create instances of Person, Employee, and Manager
        Person person = new Person("John Doe", 45);
        Employee employee = new Employee("Jane Smith", 30, "Developer");
        Manager manager = new Manager("Alice Johnson", 40, "Team Lead", 10);

        // Create an ArrayList of Person objects
        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(employee);
        people.add(manager);

        // Iterate through the list and call printDetails() on each object
        for (Person p : people) {
            p.printDetails(); // Correct overridden method will be called based on object type
        }
    }
}
