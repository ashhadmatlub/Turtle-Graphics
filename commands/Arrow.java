package commands;

// THIS IS COMPLETED NOW  
// ------------------------- THIS IS CALLED EVENT DRIVEN PROGRAMMING 

import java.awt.Graphics;
import java.awt.event.*;
// import java.util.Timer;

import javax.swing.JPanel;

import drawing.Canvas;
import geometry.Point;
import drawing.Pen;

public class Arrow extends JPanel implements ActionListener, KeyListener {
    private Point initial;
    private Pen pen;
    private Canvas cvs;

    // THE INITIAL POINT OF THE TURTLE WOULD BE ZERO
    private int velocityX = 20, velocityY = 20;

    public Arrow(Point initial, Canvas cvs) {
        addKeyListener(this); // it enables the keyboard
        setFocusable(true); // this allows to recieves user instructions ( neccessary )

        setFocusTraversalKeysEnabled(false); // neccessary , so it can perform only accroding to the given instructions
        // and not work on anything else .

        this.initial = initial;
        this.cvs = cvs;
        pen = new Pen(cvs, initial);

        // TO MOVE THE PEN TO THE INITIAL POSITION
        pen.moveTo(initial); // This will becomes the initial Point of turtle to move from
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    // It will performs the actions given by the arrow keys
    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode(); // It will get the value of the key

        if (c == KeyEvent.VK_UP) // Move's the object in upward direction by 5 Pixel
            velocityY -= 7;

        if (c == KeyEvent.VK_DOWN) // Move's the object in downward direction by 5 Pixel
            velocityY += 7;

        if (c == KeyEvent.VK_RIGHT) // Move the object towards right by 5 Pixel
            velocityX += 7;

        if (c == KeyEvent.VK_LEFT) // Move the object towards left by 5 Pixel
            velocityX -= 7;

        // THIS WILL DRAW A LINE
        pen.lineTo(new Point(velocityX, velocityY));
        repaint();
    }

    // TO PAINT THE LINES ON THE PANEL
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        cvs.paintComponent(g); // it helps to paints the lines on the panel
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}
// // just for my own
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
