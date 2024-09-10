package chap08.polytype;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다!");
    }
}