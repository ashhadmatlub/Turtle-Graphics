package drawing;

import geometry.Point;

public class Pen {
    // DECLARATION
    private Point position;
    private Canvas canva;

    // NULL CONS
    public Pen() {
        this.canva = new Canvas();
        this.position = new Point();
    }

    // PARA CONS
    public Pen(Canvas cvs, Point pos) {
        this.canva = cvs;
        this.position = pos;
    }

    // COPY CONS
    public Pen(Pen other) {
        this.canva = other.canva;
        this.position = other.position;
    }

    // SETTERS AND GETTERS
    public void setPosition(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public Canvas getCanva() {
        return canva;
    }

    public void setCanva(Canvas canva) {
        this.canva = canva;
    }

    // METHOD TO MOVE THE PEN FROM ONE POINT TO ANOTHER TO DRAW A LINE
    public void lineTo(Point z) { // Here in the argument we would enter the point to which we want to draw our
        // line from current Position
        Point initial = new Point(position.getX(), position.getY()); // here we are taking the position
        // of a current Point where actually our pen lies right now and storing it into
        // a new Point
        Point finall = new Point(z.getX(), z.getY()); // here we are taking the position of a Point
        // where we wants to end our line and similiarly storing it into a new Point

        canva.addLine(initial, finall); // Here we are using the method of addLine which we created in
        // Canvas class

        // Now we converting the final Position of Line into Initial position so we
        // contiuosly draw lines without breaking it

        this.position = new Point(finall);

    }

    // METHOD TO MOVE THE PEN AT ANY POSITION
    public void moveTo(Point m) {
        this.position = new Point(m);
    }

    // toString
    @Override
    public String toString() {
        return "The pen is currently at " + getPosition();
    }
}
