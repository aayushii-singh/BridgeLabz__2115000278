interface MealPlan {
    String getMeal();
}

class VegetarianMeal implements MealPlan {
    public String getMeal() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getMeal() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getMeal() { return "Keto"; }
}

class HighProteinMeal implements MealPlan {
    public String getMeal() { return "High-Protein"; }
}

class Meal<T extends MealPlan> {
    private T meal;
    
    Meal(T meal) { this.meal = meal; }
    
    void showMealPlan() { System.out.println(meal.getMeal()); }
}

class MealPlanner {
    static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generating");
        System.out.println(meal.getMeal());
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {
        new Meal<>(new VegetarianMeal()).showMealPlan();
        new Meal<>(new VeganMeal()).showMealPlan();
        new Meal<>(new KetoMeal()).showMealPlan();
        new Meal<>(new HighProteinMeal()).showMealPlan();

        MealPlanner.generateMealPlan(new VegetarianMeal());
        MealPlanner.generateMealPlan(new KetoMeal());
    }
}
