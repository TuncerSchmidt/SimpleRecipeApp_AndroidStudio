package com.example.androidrecipeapp;

public class Recipes {
    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;

    public Recipes(String recipeName, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail) {
        RecipeName = recipeName;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;
    }

    public String getRecipeName() {
        return RecipeName;
    }

    public void setRecipeName(String recipeName) {
        RecipeName = recipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public void setRecipeIngredients(String recipeIngredients) {
        RecipeIngredients = recipeIngredients;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public void setRecipeMethodTitle(String recipeMethodTitle) {
        RecipeMethodTitle = recipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public void setRecipe(String recipe) {
        Recipe = recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
