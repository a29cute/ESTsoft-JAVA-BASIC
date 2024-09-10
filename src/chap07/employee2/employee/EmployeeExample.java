package chap07.employee2.employee;

public class EmployeeExample {
    public static void main(String[] args) {
            FullTimeEmployee alice = new FullTimeEmployee("Alice", 2000000);
            PartTimeEmployee bob = new PartTimeEmployee("Bob", 11000, 8);

            System.out.println(alice.name + "'s Salary: " + alice.calculateSalary());
            System.out.println(bob.name + "'s Salary: " + bob.calculateSalary());

            // 추상 클래스로 객체 생성 불가
            // Employee employee = new Employee();

            /* 객체지향 다형성 */
            Employee employee1 = new FullTimeEmployee("Alice",10000); // 추상클래스를 참조하는 타입으로 가능
            System.out.println(employee1.name + "'s Salary: " + employee1.calculateSalary());
        }
}
