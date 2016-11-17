package Obstract;
//@date Nov 17, 2016
//@author Artsiom_Berazavik

public abstract class Vegetable {

    private String name;
    int weight; //private final question to mentor
    private int calorificValue;
    private double price;
    private boolean requiredHeatTratment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Vegetable(int weight) {
        this.weight = weight;
    }
    
    public double CalcCalorificValue() {
        System.out.println("Calculating calories in 100g");
        return 0.0;
    }
}
