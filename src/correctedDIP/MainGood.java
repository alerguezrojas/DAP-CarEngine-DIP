package correctedDIP;

public class MainGood {
    public static void main(String[] args) {
        Car gasCar = new Car(new GasolineEngine());
        gasCar.turnOn(); // Starting gasoline engine...

        Car evCar = new Car(new ElectricEngine());
        evCar.turnOn();  // Starting electric engine silently...

        // In tests you could inject a fake:
        Car testCar = new Car(new Engine() {
            @Override public void start() { System.out.println("[TEST] fake engine start"); }
        });
        testCar.turnOn();
    }
}

