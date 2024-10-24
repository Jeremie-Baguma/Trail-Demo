// Base class Worker
class Worker {
    String name;
    double ratePerHour;

    // Constructor for Worker
    public Worker(String name, double ratePerHour) {
        this.name = name;
        this.ratePerHour = ratePerHour;
    }

    // Method to calculate salary (to be overridden in subclasses)
    public double calculateSalary() {
        return 0; // Default implementation (not used)
    }
}

// Subclass Employee that extends Worker
class Employee extends Worker {

    // Constructor for Employee
    public Employee(String name, double ratePerHour) {
        super(name, ratePerHour);
    }

    // Overriding the calculateSalary method for Employee
    @Override
    public double calculateSalary() {
        return ratePerHour * 8 * 22; // Monthly salary calculation
    }
}

// Subclass Contractor that extends Worker
class Contractor extends Worker {

    // Constructor for Contractor
    public Contractor(String name, double ratePerHour) {
        super(name, ratePerHour);
    }

    // Overriding the calculateSalary method for Contractor
    @Override
    public double calculateSalary() {
        return ratePerHour * 8 * 20; // Monthly salary calculation (less work days)
    }
}

// Main class to test the implementation
public class EmployeeAndContractor {
    public static void main(String[] args) {
        // Creating instances of Employee and Contractor
        Employee employee = new Employee("Alice", 15.0);
        Contractor contractor = new Contractor("Bob", 20.0);

        // Calculating and printing salaries
        System.out.println("Employee Salary: " + employee.calculateSalary());   // Output: Employee Salary: 2640.0
        System.out.println("Contractor Salary: " + contractor.calculateSalary()); // Output: Contractor Salary: 3200.0
    }
}