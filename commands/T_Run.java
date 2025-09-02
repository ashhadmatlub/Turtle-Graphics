package commands;

import java.util.Scanner;

import javax.swing.JFrame;

import drawing.Canvas;
import geometry.Point;
import turtle.Turtle;

// -------------------------- THIS FILE IS FOR RUNNING TURTLE IN SQUARE BY F + Commands 

public class T_Run {
    private String input;

    public void startTurtleF() {

        Canvas canva = new Canvas();

        JFrame frame = new JFrame("F-Mode - Turtle Commands F+F+F+F");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.add(canva); // it will just add the canvas not the turtle .
        frame.setVisible(true);

        Turtle t = new Turtle(new Point(175, 225), canva);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter F then follow the instructions to make the Square and Q to exit ");

        do {

            input = sc.next().toUpperCase();

            if (input.equals("F")) {
                t.moveForward(100);
                System.out.println("Now you need to Enter ( + ) to change the direction of the TURTLE or Q TO EXIT ");
            } else if (input.equals("+")) {
                t.turnRight();
                System.out.println("Now you have to Enter ( F ) for drawing a line or Q to EXIT");
            }

        } while (!input.equals("Q"));

        sc.close();

        System.out.println("Square drawn successfully ");

        System.out.println("NOW CLOSE THE CANVAS AND RUN THE PROGRAM AGAIN TO ENJOY ALL THE MODES");

        // Canvas canva = new Canvas();

        // // Creating the Turtle
        // Turtle t = new Turtle(new Point(100, 500), canva);

        // JFrame frame = new JFrame("F-Mode - Turtle Commands F+F+F+F ");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(600, 600);
        // frame.setVisible(true);

        // frame.add(t);

    }

}
