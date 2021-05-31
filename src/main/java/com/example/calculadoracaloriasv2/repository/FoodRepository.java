package com.example.calculadoracaloriasv2.repository;

import com.example.calculadoracaloriasv2.dto.FoodDTO;

import java.util.List;

public interface FoodRepository {

    List<FoodDTO> findAll();
    FoodDTO findById(int id);
    List<FoodDTO> findAllByNameContains(String query);

}
