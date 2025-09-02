package geometry;

public class Point {
    // DECLARATION
    private int x, y;

    // NULL CONS
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // PARA CONS
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // COPY CONS
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // SETTERS AND GETTERS
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Add points
    public Point add(Point z) {
        return new Point(this.x + z.x, this.y + z.y);
        // this.x = p1 ( x ) + z.x = p2 ( x ) , this.y = p1 ( y ) + z.y = p2 ( y ) ;
    }

    // toString
    @Override
    public String toString() {
        return "Point x is : " + x + " & y is :" + y;
    }
}
