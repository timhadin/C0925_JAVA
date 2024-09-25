class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
    }
}

public class H0925_3 {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.startCar();
    }
}