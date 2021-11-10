public class Main {

    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.drive();
        System.out.println();
        carFacade.pickup();
        System.out.println();
        carFacade.delivery();
        System.out.println();
        carFacade.race();
    }
}
