package foodrecipes.MyFoodRecipesProject.services;

import foodrecipes.MyFoodRecipesProject.commands.RecipeCommand;
import foodrecipes.MyFoodRecipesProject.models.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
