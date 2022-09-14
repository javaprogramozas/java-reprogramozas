package v101.service;

import v101.model.Animal;
import v101.model.AnimalType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.toSet;
import static v101.model.AnimalType.TEST;

public class InventoryService {

    private List<Animal> animals = new ArrayList<>();

    public Optional<Animal> searchAnimalByName(String name) {
        return animals.stream()
                .filter(animal -> animal.getName().equalsIgnoreCase(name))
                .findAny();
    }

    public Set<Animal> searchAnimalsbyType(AnimalType animalType) {
        if (animalType == TEST) {
            return Set.of();
        }
        return animals.stream()
                .filter(animal -> animal.getType() == animalType)
                .collect(toSet());
    }

}
