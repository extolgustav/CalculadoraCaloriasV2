package com.example.calculadoracaloriasv2.repository;

import com.example.calculadoracaloriasv2.dto.FoodDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class FoodRepositoryImpl implements FoodRepository {

    private final List<FoodDTO> database;

    public FoodRepositoryImpl() {
        this.database = loadJSON();
    }

    @Override
    public List<FoodDTO> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public FoodDTO findById(int id) {
        return database.stream().filter(food -> food.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<FoodDTO> findAllByNameContains(String query) {
        return database.stream()
                .filter(food -> food.getName().toUpperCase().contains(query.toUpperCase()))
                .collect(Collectors.toList());
    }

    private List<FoodDTO> loadJSON() {

        List<FoodDTO> foodDTOS = null;

        try {
            File file = ResourceUtils.getFile("classpath:food-v2.json");

            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<FoodDTO>> typeRef = new TypeReference<>() {};

            foodDTOS = objectMapper.readValue(file, typeRef);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return foodDTOS;
    }
}


