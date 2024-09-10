package chap08.zoo2.zoo;

public class ZooMain {
    public static void main(String[] args){
        Zookeeper zookeeper = new Zookeeper();
        Predator animal1 = new Lion();
        Predator animal2 = new Tiger();

        zookeeper.feed(animal1);
        zookeeper.feed(animal2);
    }
}
