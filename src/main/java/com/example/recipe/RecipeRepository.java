package com.example.recipe;

import java.util.*;

public interface RecipeRepository {

    ArrayList<Recipe> getAllRecipes();

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipeById(int recipeId);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void removeRecipe(int recipeId);
}