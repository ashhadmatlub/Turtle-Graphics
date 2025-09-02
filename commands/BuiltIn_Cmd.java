package commands;

import drawing.Canvas;
import geometry.Point;
import turtle.Turtle;

// --------------------------THIS IS FOR SQAURE AND ZIGZAG 

public class BuiltIn_Cmd extends Turtle {
    private Point initialPoint;

    public BuiltIn_Cmd(Point initial, Canvas can) {
        super(initial, can);
    }

    // SQUARE
    public void square() {

        moveForward(100); // up
        turnRight(); // right
        moveForward(100); // more right
        turnRight(); // down
        moveForward(100); // more down
        turnRight(); // left
        moveForward(100); // complete left
    }

    // ZIGZAG
    public void zig(int move) {
        initialPoint = new Point(getPosition().getX() + move, getPosition().getY() - move);
        lineTo(initialPoint);
    }

    public void zag(int move) {
        initialPoint = new Point(getPosition().getX() - move, getPosition().getY() - move);
        lineTo(initialPoint);
    }
}

// Canvas canva = new Canvas();
// Turtle t = new Turtle(new Point(200, 400), canva);

// JFrame frame = new JFrame("SQUARE MODE");
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// frame.setSize(500, 500);
// frame.add(canva); // it will just add the canvas not the turtle .
// frame.setVisible(true);