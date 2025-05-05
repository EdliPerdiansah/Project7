package petapp.main;

import petapp.model.Cat;
import petapp.model.Dog;
import petapp.service.PetService;

public class MainApp {
    public static void main(String[] args) {
        PetService<Cat> catService = new PetService<>();
        PetService<Dog> dogService = new PetService<>();

        Cat cat1 = new Cat("LMoci", 2);
        Dog dog1 = new Dog("Moli", 4);

        catService.addPet(cat1);
        dogService.addPet(dog1);

        System.out.println("=== Cat List ===");
        catService.showAllPets();

        System.out.println("\n=== Dog List ===");
        dogService.showAllPets();
    }
}
