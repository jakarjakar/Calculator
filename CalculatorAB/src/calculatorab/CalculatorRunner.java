package calculatorab;
import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;
 //@date Sep 26, 2016
 //@author Artsiom_Berazavik

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
        
        out.println("Калькулятор. 4 действия на выбор" + "\n"
                + "умножение(1)" + "\n" + "деление(2)" + "\n"
                + "сложение(3)" + "\n" + "вычитание(4) " + "\n"
                + "сделайте выбор, например 3 и нажмите ввод:" + "\n");

        try {
            userChoiceAttempt = in.nextInt();
            if (userChoiceAttempt < 1 || userChoiceAttempt >= 5) {
                out.println("Арифметическая операция по умолчанию (1) ");
            } else { 
                userChoice = userChoiceAttempt;
            }
        } catch (InputMismatchException ex) {
            out.println("Введите 1, 2, 3 или 4");
            ex.printStackTrace(System.err); }
 
        try {
            while (keepRunning) {
                switch (userChoice) {
                    case 1: out.println("Будет выполнено умножение(1) двух чиел. "); break;
                    case 2: out.println("Будет выполнено деление(2) одного числа на другое. "); break;
                    case 3: out.println("Будет выполнено сложение(3) двух чисел. "); break;
                    case 4: out.println("Будет выполнено вычитание(4) одного числа из второго. "); break;
                }
                out.println("\n" + "Введите первое число, например -3,14 и нажмите ввод:");
                x = in.nextDouble();
                out.println("Введи второе число и нажмите ввод:");
                y = in.nextDouble();
                    switch (userChoice) {
                        case 3: out.println("Результатом слажения " + x + " и " + y + 
                                " является " + c.add(x, y)+ "\n"); break;
                        case 1: out.println("Результатом умножения " + x + " и " + y + 
                                " является " + c.multiplicate(x, y)+ "\n"); break;
                        case 2: out.println("Результатом деления " + x + " на " + y + 
                                " является " + c.division(x, y)+ "\n"); break;
                        case 4: out.println("Результатом вычитания " + y + " из " + x + 
                                " является " + c.subtraction(x, y)+ "\n"); break;
                    }
                    
                out.println("Повторить операцию с другими числами? (Y/n):");
                try {
                ynEnter = in.next();
                    if ("n".equals(ynEnter)) {
                    keepRunning = false;
                    out.println("Спасибо за внимание. ");
                    } 
                } catch (InputMismatchException ex) {
                    out.println("Спасибо за внимание. ");
                    ex.printStackTrace(System.err);} // end of catch 
            } // end of while
        } catch (InputMismatchException ex) {
            out.println("\n" + "Введите число при следующем запуске. \n Разделителем в дробных числах является запятая" + "\n");
            ex.printStackTrace(System.err);} //end of catch (inputMismatchException)
    } //end of main
} //end of class

