public class DeliveryCar implements Car {
    @Override
    public void drive() {
        System.out.println("Just to drive");
    }

    @Override
    public void pickup() {
        System.out.println("To pick up people");
    }

    @Override
    public void delivery() {
        System.out.println("To deliver things");
    }

    @Override
    public void race() {
        System.out.println("To race with other cars");
    }
}