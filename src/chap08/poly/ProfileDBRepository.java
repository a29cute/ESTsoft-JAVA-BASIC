package chap08.poly;

public class ProfileDBRepository implements ProfileRepository {
    public void save() {
        System.out.println("DB에 프로필 저장하는 기능");
    }
}
