package chap06.car.example;   // Car.java와 패키지가 서로 다름

import chap06.car.Car;

public class Sonata extends Car {    // Car를 상속
	public static void main(String[] args) {
		Sonata sonata = new Sonata();
		System.out.println(sonata.company);   // 상속한 클래스의 protected변수는 접근 가능
	}
}