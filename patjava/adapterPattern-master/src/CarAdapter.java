public class CarAdapter implements ToyCar {
    Car car;
    public CarAdapter(Car car) {
        this.car = car;
    }
    @Override
    public void rideNoWay() {
        car.ride();
    }
}
