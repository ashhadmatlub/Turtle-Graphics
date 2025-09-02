package drawing;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import geometry.Point;

import java.awt.Color;
import java.awt.Graphics;

public class Canvas extends JPanel {
    private List<Line> cvs_lines = new ArrayList<>();

    // METHOD FOR ADDING LINES
    public void addLine(Point p1, Point p2) {

        cvs_lines.add(new Line(p1, p2));

        System.out.println("Drawing line from ( " + p1.getX() + " , " + p1.getY() + " to " +
                p2.getX() + " , " + p2.getY() + " ) ");

        repaint();
    }

    // METHOD FOR DRAWING THOSE LINES ON CANVAS
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);// for setting the color of the lines

        for (Line line : cvs_lines) {
            g.drawLine(line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(), line.getEnd().getY());
        }
    }
}
