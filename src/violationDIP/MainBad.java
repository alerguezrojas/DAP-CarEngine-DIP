package violationDIP;

public class MainBad {
    public static void main(String[] args) {
        CarBad car = new CarBad();
        car.turnOn();
        // Problem: If we want an ElectricEngine, we must modify CarBad's code.
    }
}

