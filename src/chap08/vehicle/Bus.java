package chap08.vehicle;

public class Bus implements Vehicle {
    String vehicle;

    public Bus(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle;
    }

    @Override
    public void run() {
        System.out.println(vehicle + " is running");
    }
}
