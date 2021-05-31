package com.example.calculadoracaloriasv2.dto;

import java.util.List;

public class FoodDTO {

    private int id;
    private String name;
    private List<IngredientDTO> ingredients;
    private int totalCalories;

    public FoodDTO() {
    }

    public FoodDTO(int id, String name, List<IngredientDTO> ingredients, int totalCalories) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.totalCalories = totalCalories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IngredientDTO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientDTO> ingredients) {
        this.ingredients = ingredients;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }
}
