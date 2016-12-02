package calculatorab;

import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorRunner {

    public static void main(String[] args) {

        int userChoice = 1;
        int userChoiceAttempt;
        double x;
        double y;
        boolean keepRunning = true;
        String ynEnter;

        Arithmetic c = new Arithmetic();
        Scanner in = new Scanner(System.in);

        out.println("Calculator. 4 action for choice" + "\n"
                + "multiplication(1)" + "\n" + "deviding(2)" + "\n"
                + "adding(3)" + "\n" + "subtractioning(4) " + "\n"
                + "Make your choise, for instance 3 and press Enter:" + "\n");

        try {
            userChoiceAttempt = in.nextInt();
            int userChoiceMin = 1;
            int userChoiceMax = 5;
            if (userChoiceAttempt < userChoiceMin || userChoiceAttempt >= userChoiceMax) {
                out.println("Arithmetical by default (1) ");
            } else {
                userChoice = userChoiceAttempt;
            }
        } catch (InputMismatchException ex) {
            out.println("Enter 1, 2, 3 or 4");
            ex.printStackTrace(System.err);
        }

        try {
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
                        out.println("Dubtractioning will be performed (4). ");
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
                        out.println("Вivisioning result for " + x + " by " + y
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
                } // end of catch 
            } // end of while
        } catch (InputMismatchException ex) {
            out.println("\n" + "Enter number in next lounch. \n Use comma for floating numbers"  + "\n");
            ex.printStackTrace(System.err);
        } //end of catch (inputMismatchException)
    } //end of main
} //end of class

