package com.example.final_project.thymeleaf.services;

import com.example.final_project.entity.Dog;
import com.example.final_project.repository.DogRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class DogServiceImpl implements DogService {

    private final DogRepository repository;

    @Override
    public List<Dog> getAllDogs() {
        return repository.findAll();
    }

    @Override
    public Dog getDogById(Long id) {
        Optional<Dog> maybeDog = repository.findById(id);

        if (maybeDog.isEmpty()) {
            throw new RuntimeException("Dog with id " + id + " not found");
        }
        return maybeDog.get();
    }

    @Override
    public Dog saveDog(Dog dog) {
        return repository.save(dog);
    }

    @Override
    public void deleteDog(Long id) {
        repository.deleteById(id);
    }
}
