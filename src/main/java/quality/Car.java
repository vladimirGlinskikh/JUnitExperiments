package quality;

public class Car {
    private Driver driver;

    Car(Context context) {
        this.driver = context.getDriver();
    }
}
