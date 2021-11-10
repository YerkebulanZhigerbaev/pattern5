public class Taxi implements Car {

    @Override
    public void ride() {
        System.out.print("Ready to ride ");
    }

    @Override
    public void pickup() {
       System.out.println("PIck up!");
    }
}
