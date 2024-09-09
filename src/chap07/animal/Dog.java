package chap07.animal;

public class Dog extends Animal {

    Dog(String name){
        super();
        System.out.println("Dog 객체 생성. name: " + name);
    }

    @Override
    void sleep(){
        // 부모 클래스의 sleep() 메소드 오버라이딩
    }

    // 오버로딩
    void sleep(int times) {
         System.out.println(name + " Zzz... " + times + " hours");
     }

}
