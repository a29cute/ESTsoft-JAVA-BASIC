package chap08.vehicle;

public class Taxi implements Vehicle {
    String vehicle;

    public Taxi(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle;
    }

    @Override
    public void run() {
        System.out.println( vehicle + " is running");
    }
}
