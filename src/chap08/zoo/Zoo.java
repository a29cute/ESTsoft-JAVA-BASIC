package chap08.zoo;

public class Zoo {
    public static void main(String[] args){
        Zookeeper zookeeper = new Zookeeper();

        Lion lion = new Lion();
        zookeeper.feed(lion);

        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);
    }
}
