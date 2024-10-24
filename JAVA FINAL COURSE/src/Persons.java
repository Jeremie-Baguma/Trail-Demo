public class Persons {
    // Private fields for name and age
    private String name;
    private int age;

    // Static field to keep track of the total number of Person objects created
    private static int totalPeople = 0;

    // Constructor to initialize Person objects and increment totalPeople
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
        totalPeople++; // Increment totalPeople whenever a new Person object is created
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display the name of the person
    public void displayName() {
        System.out.println("Name: " + name);
    }

    // Method to display the age of the person
    public void displayAge() {
        System.out.println("Age: " + age);
    }

    // Static method to return the total number of Person objects created
    public static int getTotalPeople() {
        return totalPeople;
    }

}
