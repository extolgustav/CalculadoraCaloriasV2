package com.example.calculadoracaloriasv2.controller;

import com.example.calculadoracaloriasv2.dto.FoodDTO;
import com.example.calculadoracaloriasv2.service.FoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/food/{id}")
    FoodDTO findById(@PathVariable int id){
        return foodService.findFoodById(id);
    };

    @GetMapping("/foods")
    List<FoodDTO> findAll(){
        return foodService.findAllFoods();
    };

    @GetMapping("/foods/{query}")
    List<FoodDTO> findByNameContains(@PathVariable String query){
        return foodService.findAllFoodsByNameContains(query);
    };

}
