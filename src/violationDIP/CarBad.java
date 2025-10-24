package violationDIP;

class CarBad {
    private final GasolineEngine engine = new GasolineEngine(); // depends on a concrete detail

    public void turnOn() {
        engine.start();
    }
}

