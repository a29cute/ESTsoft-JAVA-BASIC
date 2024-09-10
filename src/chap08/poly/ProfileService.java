package chap08.poly;

public class ProfileService {

    ProfileRepository repository;
    public void saveProfile(){
        repository= new ProfileDBRepository();
     // repository = new ProfileMemoryRepository(); 이 부분만 바꿀 수 있음
        repository.save();

    }

}
