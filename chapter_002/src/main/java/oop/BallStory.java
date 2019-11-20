package oop;

public class BallStory {
    static public  void main(String[] args) {
        Hare hare = new Hare();
        Ball ball = new Ball();
        GreyWolf greyWolf = new GreyWolf();
        Fox fox = new Fox();
        ball.born();
        hare.meeting(ball);
        hare.tryEat(ball);
        ball.singSong();
        ball.runAway();
        greyWolf.meeting(ball);
        greyWolf.tryEat(ball);
        ball.singSong();
        ball.runAway();
        fox.meeting(ball);
        ball.singSong();
        fox.tryEat(ball);
    }
}
