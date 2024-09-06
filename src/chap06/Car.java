package chap06;

public class Car {
    String company; // 필드(인스턴스 변수)
    String model;
    int maxSpeed;

    /* 오버로딩(overloading) : 이름이 같은 메서드(생성자)에 다양한 매개변수를 정의 */
    Car(String company){
        this.company = company;
    }

    Car(String company, String model){
        this.company = company;
        this.model = model;
    }

    Car(String company, String model, int maxSpeed){ // 매개변수가 있는 생성자
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    /* 메소드 void와 return */
    void setModel(String model){
        this.model = model;
    }

    void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    String printField(){
        return "회사명: " + company + "\t\t" + "모델명: " + model + "\t\t" + "최대속도: " + maxSpeed;
    }

    public static void main(String[] args) { // main 메소드
        Car car1 = new Car("기아자동차");
        Car car2 = new Car("현대자동차","sonata");
        Car car3 = new Car("페라리", "ferrari", 300);

        car1.setModel("k8 model");
        car1.setMaxSpeed(100);
        car2.setMaxSpeed(200);

        System.out.println(car1.printField());
        System.out.println(car2.printField());
        System.out.println(car3.printField());
    }
}
