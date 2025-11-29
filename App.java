import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        RecipeManager manager = new RecipeManager();
        List<String> ingredients;
        List<String> preferences;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter available ingredients (comma separated):");
            String ingredientsInput = scanner.nextLine();
            ingredients = Arrays.stream(ingredientsInput.split(","))
                    .map(String::trim)
                    .collect(Collectors.toList());
            System.out.println("Enter dietary preferences (comma separated, e.g., Vegetarian, Gluten-Free, None):");
            String prefsInput = scanner.nextLine();
            preferences = Arrays.stream(prefsInput.split(","))
                    .map(String::trim)
                    .collect(Collectors.toList());
        }

        List<Recipe> foundRecipes = manager.findRecipes(ingredients, preferences);

        if (foundRecipes.isEmpty()) {
            System.out.println("No recipes found matching your criteria.");
        } else {
            System.out.println("Found Recipes:");
            for (Recipe recipe : foundRecipes) {
                System.out.println("- " + recipe.getName());
                System.out.println("  Instructions: " + recipe.getInstructions());
            }
        }
    }
}