package petapp.service;

import petapp.model.Pet;
import java.util.ArrayList;
import java.util.List;

public class PetService<T extends Pet> {
    private List<T> petList = new ArrayList<>();

    public void addPet(T pet) {
        petList.add(pet);
    }

    public void showAllPets() {
        for (T pet : petList) {
            pet.displayInfo();
            pet.makeSound();
        }
    }
}
