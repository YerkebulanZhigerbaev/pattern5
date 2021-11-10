public class WaterSportType extends SportType {
    WaterSportType(Ball ball) {
        super(ball);
    }
    public void request() {
        System.out.print("Request for Water Sport Type: ");
        ball.jump();
    }
}
