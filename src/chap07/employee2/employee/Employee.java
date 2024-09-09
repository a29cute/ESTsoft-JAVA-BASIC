package chap07.employee2.employee;

public abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    abstract double calculateSalary();
}