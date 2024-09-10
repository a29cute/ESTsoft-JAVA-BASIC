package chap08.zoo2.zoo;

public class Lion implements Predator {
    String name = "사자";

    public String getName() {
        return name;
    }

    @Override
    public String getFood() {
        return "고기";
    }
}
