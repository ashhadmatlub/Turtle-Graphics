package commands;

import java.util.Scanner;

import javax.swing.JFrame;

import drawing.Canvas;
import geometry.Point;

public class BuiltIn_Cmd_Run {
    private int inp;

    public void startBuiltIn() {

        Canvas canva = new Canvas();

        JFrame frame = new JFrame("BUILT IN COMMANDS ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(canva); // it will just add the canvas not the turtle .
        frame.setVisible(true);

        BuiltIn_Cmd builtInRun = new BuiltIn_Cmd(new Point(200, 400), canva);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 FOR SQUARE , Enter 2 FOR ZIGZAG");
        inp = sc.nextInt();

        if (inp == 1) {
            builtInRun.square();

            System.out.println("NOW CLOSE THE CANVAS IF YOU ARE DONE AND RUN THE PROGRAM AGAIN TO ENJOY ALL THE MODES");
        } else if (inp == 2) {
            builtInRun.zig(50); // left
            builtInRun.zag(50); // right
            builtInRun.zig(50); // left
            builtInRun.zag(50); // right
            builtInRun.zig(50); // left
            builtInRun.zag(50); // right

            System.out.println("NOW CLOSE THE CANVAS IF YOU ARE DONE AND RUN THE PROGRAM AGAIN TO ENJOY ALL THE MODES");
        }
    }
}
