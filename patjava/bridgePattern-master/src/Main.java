public class Main {

    public static void main(String[] args) {
        SportType a = new FootballBall(new TennisBall()); a.request();
        a.setPrint(new VolleyballBall()); a.request();
        a.setPrint(new BasketBall()); a.request();
        SportType b =new WaterSportType(new TennisBall()); b.request();
        b.setPrint(new VolleyballBall()); b.request();

    }
}
