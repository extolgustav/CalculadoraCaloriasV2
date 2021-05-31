package com.example.calculadoracaloriasv2.service;

import com.example.calculadoracaloriasv2.dto.FoodDTO;

import java.util.List;

public interface FoodService {

    List<FoodDTO> findAllFoods();

    FoodDTO findFoodById(int id);

    List<FoodDTO> findAllFoodsByNameContains(String query);

}
