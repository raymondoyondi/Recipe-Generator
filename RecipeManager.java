import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecipeManager {
    private final List<Recipe> allRecipes;

    public RecipeManager() {
        this.allRecipes = initializeRecipes();
    }

    private List<Recipe> initializeRecipes() {
        // Hardcoded sample recipes
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Spaghetti Carbonara", 
            Arrays.asList(new Ingredient("Spaghetti"), new Ingredient("Eggs"), new Ingredient("Bacon"), new Ingredient("Cheese")), 
            Arrays.asList("None"), "Cook pasta, mix with eggs, bacon, and cheese."));
        recipes.add(new Recipe("Lentil Soup", 
            Arrays.asList(new Ingredient("Lentils"), new Ingredient("Carrots"), new Ingredient("Onion"), new Ingredient("Celery")), 
            Arrays.asList("Vegetarian", "Gluten-Free"), "Boil lentils and vegetables until soft."));
        return recipes;
    }

    public List<Recipe> findRecipes(List<String> availableIngredients, List<String> dietaryPrefs) {
        return allRecipes.stream()
            .filter(recipe -> recipe.getDietaryPreferences().containsAll(dietaryPrefs))
            .filter(recipe -> availableIngredients.containsAll(recipe.getIngredients().stream().map(Ingredient::getName).collect(Collectors.toList())))
            .collect(Collectors.toList());
    }
}