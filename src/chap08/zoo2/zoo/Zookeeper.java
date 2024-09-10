package chap08.zoo2.zoo;

/**
 * 인터페이스를 사용하도록 코드 변경  (Zoo 클래스는 그대로)
 * Zookeeper feed 메소드 파라미터 변경
 * 인터페이스의 추상메소드(getFood) 추가
 */
public class Zookeeper {
    public void feed(Predator predator){
        System.out.println(predator.getName()+"한테 "+
                           predator.getFood() +"를 주었습니다.");
    }
}
