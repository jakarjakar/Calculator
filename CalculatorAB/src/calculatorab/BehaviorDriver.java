package calculatorab;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;

public class BehaviorDriver {

    String ynEnter;
    double x;
    double y;
    int userChoice = 1;
    int userChoiceAttempt;
    boolean keepRunning = true;

    Arithmetic c = new Arithmetic();
    Scanner in = new Scanner(System.in);

    public void UserNotification() {
        out.println("Calculator. 4 action for choice" + "\n"
                + "multiplication(1) by default" + "\n" + "deviding(2)" + "\n"
                + "adding(3)" + "\n" + "subtractioning(4) " + "\n"
                + "Make your choise, for instance 3 and press Enter:" + "\n");
    }

    public void userChoiceAttempt() {
        userChoiceAttempt = in.nextInt();
        int userChoiceMin = 1;
        int userChoiceMax = 5;
        if (userChoiceAttempt < userChoiceMin || userChoiceAttempt >= userChoiceMax) {
            out.println("Multiplication by default (1) ");
        } else {
            userChoice = userChoiceAttempt;
        }
    }

    public void flowDriver() {
        while (keepRunning) {
            switch (userChoice) {
                case 1:
                    out.println("Multiplication by default (1). ");
                    break;
                case 2:
                    out.println("Divisioning will be performed (2). ");
                    break;
                case 3:
                    out.println("Adding will be performed (3). ");
                    break;
                case 4:
                    out.println("Subtractioning will be performed (4). ");
                    break;
            }

            out.println("\n" + "Enter first value, for example -3,14 end press Enter:");
            x = in.nextDouble();
            out.println("Type the second value, Enter:");
            y = in.nextDouble();

            switch (userChoice) {
                case 3:
                    out.println("The result wiht adding " + x + " and " + y
                            + " is: " + c.adding(x, y) + "\n");
                    break;
                case 1:
                    out.println("The multiplication result for " + x + " and " + y
                            + " is: " + c.multiplication(x, y) + "\n");
                    break;
                case 2:
                    out.println("Divisioning result for " + x + " by " + y
                            + " is: " + c.divisioning(x, y) + "\n");
                    break;
                case 4:
                    out.println("Subtractioning result " + y + " and " + x
                            + " is: " + c.subtractioning(x, y) + "\n");
                    break;
            }

            out.println("Repeat the action with another values? (Y/n):");

            try {
                ynEnter = in.next();
                if ("n".equals(ynEnter)) {
                    keepRunning = false;
                    out.println("Thanks for starting the code ");
                }

            } catch (InputMismatchException ex) {
                out.println("Thank you. ");
                ex.printStackTrace(System.err);

            }
        }
    }
}
