import java.util.List;

public class Recipe {
    private final String name;
    private final List<Ingredient> ingredients;
    private final List<String> dietaryPreferences; // e.g., "Vegetarian", "Gluten-Free"
    private final String instructions;

    // Constructor, getters, and setters
    public Recipe(String name, List<Ingredient> ingredients, List<String> dietaryPreferences, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.dietaryPreferences = dietaryPreferences;
        this.instructions = instructions;
    }

    public String getName() { return name; }
    public List<Ingredient> getIngredients() { return ingredients; }
    public List<String> getDietaryPreferences() { return dietaryPreferences; }
    public String getInstructions() { return instructions; }
}
