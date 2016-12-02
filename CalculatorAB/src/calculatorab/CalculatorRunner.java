package calculatorab;

import static java.lang.System.out;
import java.util.InputMismatchException;

public class CalculatorRunner {

    public static void main(String[] args) {

        BehaviorDriver BeDr = new BehaviorDriver();

        BeDr.UserNotification();
        
        try {
            BeDr.userChoiceAttempt();
        } catch (InputMismatchException ex) {
            out.println("Enter 1, 2, 3 or 4");
            ex.printStackTrace(System.err);
        }

        try {
            BeDr.flowDriver();
        } catch (InputMismatchException ex) {
            out.println("\n" + "Enter number in next lounch. \nUse comma for floating numbers" + "\n");
            ex.printStackTrace(System.err);
        }
    }
}
