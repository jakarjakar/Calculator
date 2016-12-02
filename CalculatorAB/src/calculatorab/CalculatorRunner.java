package calculatorab;

import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {

        BehaviorDriver BeDr = new BehaviorDriver();

        out.println("Calculator. 4 action for choice" + "\n"
                + "multiplication(1) by default" + "\n" + "deviding(2)" + "\n"
                + "adding(3)" + "\n" + "subtractioning(4) " + "\n"
                + "Make your choise, for instance 3 and press Enter:" + "\n");

        try {
            BeDr.userChoiceAttempt();
        } catch (InputMismatchException ex) {
            out.println("Enter 1, 2, 3 or 4");
            ex.printStackTrace(System.err);
        }

        try {
            BeDr.flowDriver();
        } catch (InputMismatchException ex) {
            out.println("\n" + "Enter number in next lounch. \n Use comma for floating numbers" + "\n");
            ex.printStackTrace(System.err);
        }
    }
}
