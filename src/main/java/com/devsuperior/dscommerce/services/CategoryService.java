package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.CategoryDTO;
import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<CategoryDTO> findAll(){
        List<Category> categories = repository.findAll();
        List<CategoryDTO> dtos = new ArrayList<>();

        ModelMapper modelMapper = new ModelMapper();

        categories.forEach(category -> {
            dtos.add(modelMapper.map(category, CategoryDTO.class));
        });

        return dtos;
    }
}
