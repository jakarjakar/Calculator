package Obstract;
 //@date Nov 17, 2016
 //@author Artsiom_Berazavik

public abstract class Vegetable {
    private String name;
    private int massa;
    private int calorificValue;
    private double price;
    private boolean requiredHeadTratment;
    
    // разобрать геттеры и сеттеры еще раз. 
    public String getName () {
        return name;
    }
}
