package commands;

import javax.swing.JFrame;

import drawing.Canvas;
import geometry.Point;

public class ArrowRun {

    public void start() {

        // Creating canvas
        Canvas cvs = new Canvas();

        // Creating the Arrow Panel
        Arrow arrow = new Arrow(new Point(20, 20), cvs);

        // Open the JFrame and putting it inside it
        JFrame frame = new JFrame("Free Mode - Turtle Controlled By Arrow  ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);

        frame.add(arrow);

        System.out.println(
                "IF IT IS NOT DRAWING LINES ON THE SCREEN THEN RUN THE PROGRAM AGAIN 2 to 3 TIMES IT'S MAY BE THE COMPILATION ISSUE ");

        System.out.println("NOW CLOSE THE CANVAS IF YOU ARE DONE AND RUN THE PROGRAM AGAIN TO ENJOY ALL THE MODES");

    }
}
