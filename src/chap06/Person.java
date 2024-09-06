package chap06;

public class Person {
    final String nation;
    String name;

    Person(String name){
        this.nation = "Korea"; // 생성자 안에서 final 멤버 변수(인스턴스 변수) 초기화 가능
        this.name = name;
    }
}
