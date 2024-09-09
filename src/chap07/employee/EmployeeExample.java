package chap07.employee;

public class EmployeeExample {
    public static void main(String[] args) {
            FullTimeEmployee alice = new FullTimeEmployee("Alice", 2000000);
            PartTimeEmployee bob = new PartTimeEmployee("Bob", 11000, 8);

            System.out.println(alice.name + "'s Salary: " + alice.calculateSalary());
            System.out.println(bob.name + "'s Salary: " + bob.calculateSalary());
        }
}
