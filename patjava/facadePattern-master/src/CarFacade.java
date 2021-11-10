public class CarFacade {
    private RaceCar raceCar;
    private DeliveryCar deliveryCar;
    private Taxi taxi;

    public CarFacade() {
        raceCar = new RaceCar();
        deliveryCar = new DeliveryCar();
        taxi = new Taxi();
    }

    public void drive() {
        raceCar.drive();
        deliveryCar.drive();
        taxi.drive();
    }

    public void pickup() {
        raceCar.pickup();
        deliveryCar.pickup();
        taxi.pickup();
    }

    public void delivery() {
        raceCar.delivery();
        deliveryCar.delivery();
        taxi.delivery();
    }

    public void race() {
        raceCar.race();
        deliveryCar.race();
        taxi.race();
    }
}
