package commands;

import java.util.Scanner;

public class FinalRun {
    private int mode;

    public void finalRun() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Which Mode you wanna enter ?");
        System.out.println("Press 1 ( Free ) , Press 2 ( F+F+F+F ) , Press 3 ( Square or Zigzag)");

        mode = sc.nextInt();

        if (mode == 1) {
            ArrowRun arrowRun = new ArrowRun();
            System.out.println("GO ON THE CANVAS AND PLAY WITH THE TURTLE THROUGH ARROW KEY");
            arrowRun.start();

        } else if (mode == 2) {
            T_Run turtleRun = new T_Run();
            turtleRun.startTurtleF();
        } else if (mode == 3) {
            BuiltIn_Cmd_Run builtRun = new BuiltIn_Cmd_Run();
            builtRun.startBuiltIn();
        } else {
            System.out.println("Sorry wrong command ");
        }
    }
}
