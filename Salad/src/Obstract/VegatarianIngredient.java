package Obstract;
 //@date Nov 10, 2016
 //@author Artsiom_Berazavik

public class VegatarianIngredient {
    protected boolean containsMeet;
    protected boolean containsAnimalMilk; 
    double pranaIndex; //used to increase the calority for vegetarian salads.

    public VegatarianIngredient() {
        this.pranaIndex = 1.1;
        this.containsMeet = false;
        this.containsAnimalMilk = false;
    }
    
    public double caloriesCalculation () {
        return 8;
    }
            
}
