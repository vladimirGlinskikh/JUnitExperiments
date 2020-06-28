package quality;

public class Vehicle {
//    Driver driver = new Driver();
//    boolean hasDriver = true;
//
//    private void setHasDriver(boolean hasDriver){
//        this.hasDriver = hasDriver;
//    }

    Driver driver;
    boolean hasDriver = true;

    public Vehicle(Driver driver) {
        this.driver = driver;
    }

    public void setHasDriver(boolean hasDriver) {
        this.hasDriver = hasDriver;
    }
}
