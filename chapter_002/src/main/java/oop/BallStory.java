package oop;

public class BallStory {
    static public  void main(String[] args) {
        Hare hare = new Hare();
        Ball ball = new Ball();
        GreyWolf greyWolf = new GreyWolf();
        Fox fox = new Fox();
        ball.born();
        hare.meeting(ball);
        hare.try_to_eat(ball);
        ball.sing_song();
        ball.run_away();
        greyWolf.meeting(ball);
        greyWolf.try_to_eat(ball);
        ball.sing_song();
        ball.run_away();
        fox.meeting(ball);
        ball.sing_song();
        fox.try_to_eat(ball);
    }
}
