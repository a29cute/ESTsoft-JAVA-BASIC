package chap07.computer;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Computer computer = new Computer();
        System.out.println(calculator.areaCircle(10));
        System.out.println(computer.areaCircle(10));
    }
}
