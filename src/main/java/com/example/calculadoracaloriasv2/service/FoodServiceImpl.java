package com.example.calculadoracaloriasv2.service;


import com.example.calculadoracaloriasv2.dto.FoodDTO;
import com.example.calculadoracaloriasv2.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public List<FoodDTO> findAllFoods() {
        return foodRepository.findAll();
    }

    @Override
    public FoodDTO findFoodById(int id) {
        return foodRepository.findById(id);
    }

    @Override
    public List<FoodDTO> findAllFoodsByNameContains(String query) {
        return foodRepository.findAllByNameContains(query);
    }
}
