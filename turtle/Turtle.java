package turtle;

import drawing.*;
import geometry.Point;

public class Turtle extends Pen {
    private Point initialPoint;
    private int move;
    private int count = 1;

    public Turtle(Point initial, Canvas can) {
        super(can, initial); // IMPORTANT: give Pen the same Canvas and start point
        this.initialPoint = new Point(initial);
    }

    // TO MOVE THE TURTLE
    public void moveForward(int move) {

        if (count == 1) { // move upward
            initialPoint = new Point(getPosition().getX(), getPosition().getY() - move);
            count++;
            // canvas.repaint();
        } else if (count == 3) {
            initialPoint = new Point(getPosition().getX() + (move - 1), getPosition().getY());
            count++;
            // canvas.repaint();
        } else if (count == 5) { // move down
            initialPoint = new Point(getPosition().getX(), getPosition().getY() + (move - 1));
            count++;
            // canvas.repaint();
        } else if (count == 7) {
            initialPoint = new Point(getPosition().getX() - (move - 1), getPosition().getY());
            count -= count - 1;
            // canvas.repaint();
        }
        lineTo(initialPoint); // Draw Line
        // canvas.repaint();
    }

    public void turnRight() {
        // move right
        if (count == 2) {
            initialPoint = new Point(getPosition().getX() + 1, getPosition().getY());
            count++;
        } else if (count == 4) {
            initialPoint = new Point(getPosition().getX(), getPosition().getY() + 1);
            count++;
        } else if (count == 6) {
            initialPoint = new Point(getPosition().getX() - 1, getPosition().getY());
            count++;
        } else {
            initialPoint = new Point(getPosition());
        }

        lineTo(initialPoint); // Draw Line
        // canvas.repaint();
    }

}
// THIS METHOD IS FOR USER REVIEW , NO NEED FOR THIS BUT JUST FOR MY OWN

// public void userReview() {

// Scanner sc = new Scanner(System.in);
// review = sc.next().toLowerCase().trim();

// System.out.println("Do you like this mode ? ( yes or no )");

// if (review.equals("yes") || review.equals("y")) {
// System.out.println("Good to hear that <3 ");

// System.out.println("NOW CLOSE THE CANVAS AND RUN THE PROGRAM AGAIN TO ENJOY
// OTHER MODES");
// } else if (review.equals("no") || review.equals("n")) {
// System.out.println("Oh! we will try to be better ");

// System.out.println("NOW CLOSE THE CANVAS AND RUN THE PROGRAM AGAIN TO PLAY
// OTHER MODES");

// }
// }

// public void turnLeft() {
// // move left
// if (count == 6)
// this.initialPoint = new Point(getPosition().getX() - 1,
// getPosition().getY());
// lineTo(initialPoint); // Draw Line
// count++;
// }
