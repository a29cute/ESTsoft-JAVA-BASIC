package chap08.zoo2.zoo;

public class Tiger implements Predator {
    String name = "호랑이";

    public String getName() {
        return name;
    }

    @Override
    public String getFood() {
        return "생선";
    }
}
