package app;

import commands.FinalRun;

public class App {

    public void run() {
        FinalRun start = new FinalRun();
        start.finalRun();
    }

    // // --------------------------CREATING A WINDOW
    // JFrame frame = new JFrame();

    // frame.setTitle("Ashhad Turtle");
    // frame.setSize(600, 600);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // frame.setVisible(true);
    // frame.add(canva);

    // --------------------------FOR POINT
    // Point p1 = new Point(2, 3); // PARA CONS
    // System.out.println(p1);
    // Point p2 = new Point(p1);// COPY CONS
    // System.out.println(p2);

    // --------------------------Checking the point add methods
    // Point p3 = p2.add(p1);
    // System.out.println(p3);

    // --------------------------FOR LINE
    // Line l1 = new Line(new Point(2, 4), new Point(4, 8));// PARA CONS
    // System.out.println(l1);

    // --------------------------FOR CANVAS
    // Canvas canva = new Canvas();

    // --------------------------FOR PEN
    // Pen dollar = new Pen(canva, new Point(200, 200)); // this is the initial
    // point of pen
    // System.out.println(dollar);

    // --------------------------DRAWING A TRIANGLE FROM PEN
    // dollar.lineTo(new Point(100, 300)); // this will becomes the second point
    // dollar.lineTo(new Point(300, 300)); // this will becomes the third point
    // dollar.lineTo(new Point(200, 200)); // this will becomes the fourth point
    // which is
    // basically the initial point from where we started

    // --------------------------DRAWING A SQUARE BY USING A MOVETO METHOD
    // dollar.moveTo(new Point(400, 400)); // now the pen move to this position

    // // Now drawing a square from that new POINT
    // dollar.lineTo(new Point(400, 450));
    // dollar.lineTo(new Point(450, 450));
    // dollar.lineTo(new Point(450, 400));
    // dollar.lineTo(new Point(400, 400));
}
