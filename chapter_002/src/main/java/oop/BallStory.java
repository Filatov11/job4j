package oop;

/**.
 * BallStory
 */
public class BallStory {
    static final public void main(final String[] args) {
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
