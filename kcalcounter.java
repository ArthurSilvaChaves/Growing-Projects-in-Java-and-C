// dia 5 - dia 05/01/2026 - contador de calorias

import java.util.Scanner;
import java.util.ArrayList;

public class kcalcounter {
    public static void main(String[] args){
        ArrayList<Food> foods = new ArrayList<>();

        foods.add(new Food("Arroz", 1.3, 28.0/100.0, 3.6/100.0, 2.7/100.0, 0.3/100.0));
        foods.add(new Food("Feijao", 1.2, 14.0/100.0, 8.0/100.0, 0.5/100.0, 5.0/100.0));
        foods.add(new Food("Frango grelhado", 1.5, 0.0, 31.0/100.0, 3.6/100.0, 0.0));

        System.out.println("Contador de Calorias");
        System.out.println("-------------------");
        System.out.println("Alimentos disponiveis:");
        
        for(int i = 0; i < foods.size();i++){
            System.out.println((i+1) + ". "+ foods.get(i).getName());
        }
    }
}
