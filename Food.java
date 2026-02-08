//dia 5,6 - dia 05/01/2026 - contador de calorias

public class Food {
    
    private String name;
    private double kcalpergram;
    private double carbs;
    private double protein;
    private double fat;
    private double fiber;
    
    public Food(String name, double kcalpergram, double carbs, double protein, double fat, double fiber) {
        this.name = name;
        this.kcalpergram = kcalpergram;
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
        this.fiber = fiber;
    }

    public double kcalFor(double grams){
        return kcalpergram * grams;
    }

    public double carbsFor(double grams){
        return carbs * grams;
    }

    public double proteinFor(double grams){
        return protein * grams;
    }

    public double fatFor(double grams){
        return fat * grams;
    }

    public double fiberFor(double grams){
        return fiber * grams;
    }

    public String getName(){
        return name;
    }

}
