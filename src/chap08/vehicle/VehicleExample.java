package chap08.vehicle;

public class VehicleExample {
    public static void main(String[] args){
        // Bus, Taxi 구현
        Bus bus = new Bus("Bus");
        Taxi taxi = new Taxi("Taxi");

        bus.run();
        taxi.run();


    }
}
