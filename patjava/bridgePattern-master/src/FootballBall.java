public class FootballBall extends SportType {
    FootballBall(Ball ball) {
        super(ball);
    }
    public void request() {
        System.out.print("Request for Foorball ball: ");
        ball.jump();
    }
}
