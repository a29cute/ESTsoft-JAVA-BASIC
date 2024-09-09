package chap07.employee;

public class FullTimeEmployee extends Employee {
    double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}