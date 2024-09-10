package chap08.defaultmethod;

public class PredatorMain {
    public static void main(String[] args){
        Predator predator = new Predator() {
            @Override
            public String getFood() {
                return "수박";
            }
        };

        predator.printFood();
    }
}
