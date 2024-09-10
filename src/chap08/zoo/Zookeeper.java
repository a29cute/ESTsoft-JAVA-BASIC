package chap08.zoo;

/**
 * 인터페이스 사용하지 않고
 * 사육사가 각 동물마다 다른 먹이를 주는 feed()메소드 호출
 */
public class Zookeeper {
    public void feed(Lion lion){
        System.out.println("사자가 물고기를 잡았습니다.");
    }

    public void feed(Tiger tiger){
            System.out.println("호랑이가 물고기를 잡았습니다.");
    }
}
