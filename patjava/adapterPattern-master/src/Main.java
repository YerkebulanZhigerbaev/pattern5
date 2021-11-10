public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        ToyCar toyCar = new WoodToyCar();
        ToyCar carAdapter = new CarAdapter(taxi);

        System.out.print("Taxi: ");
        taxi.ride();
        taxi.pickup();

        System.out.print("ToyCar: ");
        toyCar.rideNoWay();

        System.out.print("CarAdapter: ");
        carAdapter.rideNoWay();
    }
}

