abstract class SportType {
    Ball ball;

    public void setPrint(Ball ball) {
        this.ball = ball;
    }

    SportType(Ball ball){
        this.ball = ball;
    }
    void request() {
      ball.jump();
    }
}
