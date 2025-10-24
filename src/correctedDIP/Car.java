package correctedDIP;

public class Car {
    private final Engine engine; // depends on abstraction

    // Constructor injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void turnOn() {
        engine.start();
    }
}

