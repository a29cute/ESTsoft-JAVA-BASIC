package chap07.animal;

public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    Animal(){
        System.out.println("Animal 객체 생성");
    }

    void sleep() {
        System.out.println(this.name + " Zzz...");
    }

}