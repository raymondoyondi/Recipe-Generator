import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Recipe {

    private String name;
    private final List<String> ingredients;
    private final String instructions;

    public Recipe(String name, List<String> ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Recipe(List<String> ingredients, String instructions) {
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe: " + name +
               "\nIngredients: " + String.join(", ", ingredients) +
               "\nInstructions: " + instructions;
    }

    public static void main(String[] args) {
        List<Recipe> recipes = new ArrayList<>();
        
        // Add some sample recipes
        recipes.add(new Recipe("Spaghetti Carbonari", 
            List.of("Spaghetti", "Eggs", "Parmesan cheese", "Black pepper"), 
            "Cook spaghetti. Mix eggs and cheese. Combine all ingredients quickly off the heat."));
            
        recipes.add(new Recipe("Simple Salad", 
            List.of("Lettuce", "Tomatoes", "Cucumbers", "Olive Oil", "Vinegar"), 
            "Chop vegetables. Mix with oil and vinegar. Serve fresh."));
            
        recipes.add(new Recipe("Scrambled Eggs", 
            List.of("Eggs", "Milk", "Butter", "Salt", "Pepper"), 
            "Whisk eggs and milk. Melt butter in pan. Cook on low heat, stirring gently."));

        // Generate and display a random recipe
        Random random = new Random();
        int randomIndex = random.nextInt(recipes.size());
        Recipe generatedRecipe = recipes.get(randomIndex);

        System.out.println("Here is a randomly generated recipe for you:");
        System.out.println("--------------------------------------------");
        System.out.println(generatedRecipe.toString());
        System.out.println("--------------------------------------------");
    }
}
