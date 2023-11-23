// Employee.java - The base class
 abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void performRoleActivity();
}

// Designer.java - Subclass for designers
 class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }

    // Implementation of the abstract method for designers
    @Override
    public void performRoleActivity() {
        System.out.println(getName() + " is designing the architecture.");
    }
}

// Programmer.java - Subclass for programmers
 class Programmer extends Employee {
    public Programmer(String name) {
        super(name);
    }

    // Implementation of the abstract method for programmers
    @Override
    public void performRoleActivity() {
        System.out.println(getName() + " is writing code.");
    }
}

// Tester.java - Subclass for testers
 class Tester extends Employee {
    public Tester(String name) {
        super(name);
    }

    // Implementation of the abstract method for testers
    @Override
    public void performRoleActivity() {
        System.out.println(getName() + " is testing the software.");
    }
}

// Company.java - Main class to demonstrate the use of employees
public class Company {
    public static void main(String[] args) {
        // Creating instances of Designer, Programmer, and Tester


        // Using parent class reference
        Employee designer = new Designer("Alice");
        Employee programmer = new Programmer("Bob");
        Employee tester = new Tester("Charlie");

// Polymorphism allows treating all employees uniformly
        designer.performRoleActivity();
        programmer.performRoleActivity();
        tester.performRoleActivity();
    }
}
