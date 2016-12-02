package calculatorab;

public class Arithmetic {

    public double x;
    public double y;
    public double result;

    public Arithmetic() {
    }

    public Arithmetic(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double adding(double x, double y) {
        result = x + y;
        return result;
    }

    public double multiplication(double x, double y) {
        result = x * y;
        return result;
    }

    public double divisioning(double x, double y) {
        try {
            if (y == 0) {
                System.out.println("Делите на НОЛЬ, имейте в виду: \n"
                        + "1/0 retunt Infinity.\n"
                        + "(-1)/0 return -Infinity.\n"
                        + "0/0 return NaN.\n"
                        + "Additional ifo in RFC IEEE 754 \n");
            }
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Deviding by 0 detected, do not do that" + e.getMessage());
        }
        return result;
    }

    public double subtractioning(double x, double y) {
        result = x - y;
        return result;
    }
}
