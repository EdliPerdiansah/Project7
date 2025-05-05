package petapp.model;

public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " eats " + food);
    }

    @Override
    public void displayInfo() {
        System.out.println("Cat - Name: " + getName() + ", Age: " + getAge());
    }
}