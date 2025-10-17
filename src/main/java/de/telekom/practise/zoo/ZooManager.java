package de.telekom.practise.zoo;

import de.telekom.practise.zoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZooManager {
    List<Animal> animals = new ArrayList<>();

    public ZooManager() {
        animals.add(new Animal("Lion", 1));
        animals.add(new Animal("Tiger", 2));
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(int id) {
        animals.removeIf(animal -> animal.getId() == id);
    }

    public boolean containsAnimal(int id) {
        boolean animalExists = false;
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                animalExists = true;
                break;
            }
        }
        return animalExists;
    }
}
