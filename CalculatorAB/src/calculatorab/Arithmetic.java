package calculatorab;
//@author Artsiom_Berazavik

public class Arithmetic {
    
    public double x; 
    public double y; 
    public double result; 
    
 //Default constructor  
    public Arithmetic () {
    }
    
//Constructor, wait for two double
    public Arithmetic (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double add (double x, double y) {
        result = x + y;
        return result;
    }
    
    public double multiplicate (double x, double y) {
        result = x * y;
        return result;
    }
    
    public double division (double x, double  y) {
        try {
            if (y == 0) {
                System.out.println("Делите на НОЛЬ, имейте в виду: \n"+
                        "1/0 дает Infinity.\n" +
                        "(-1)/0 дает -Infinity.\n" +
                        "0/0 дает NaN.\n" +
                        "Побробее о том что это за числа, описано в RFC IEEE 754 \n");
            }
            result = x / y;
            } catch (ArithmeticException e) {
            System.out.println("Делить на ноль исторически не преемлемно" + " Потому что 42 и" + e.getMessage());
        }
        return result;
    }

    public double subtraction(double x, double y) {
        result =  x - y;
        return result;
    }
}

