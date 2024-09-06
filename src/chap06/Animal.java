package chap06;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sleep() {
        return getName() + "는 자고 있습니다.";
    }

    public static void main(String[] args) {
        Animal cat = new Animal("고양이");
        Animal dog = new Animal("강아지");

        System.out.println(cat.sleep());
        System.out.println(dog.sleep());
    }
}