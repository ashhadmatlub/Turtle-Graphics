package drawing;

import geometry.Point;

public class Line {
    // DECLARATION
    private Point start, end;

    // NULL CONS
    public Line() {
        this.start = new Point(0, 0);
        this.end = new Point(0, 0);
    }

    // PARA CONS
    public Line(Point s, Point e) {
        this.start = s;
        this.end = e;
    }

    // COPY CONS
    public Line(Line other) {
        this.start = other.start;
        this.end = other.end;
    }

    // GETTERS AND SETTERS
    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    // toString for better output Print
    @Override
    public String toString() {
        return "Line starts at : " + start + " ends at : " + end;
    }
}
