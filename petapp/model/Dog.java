package petapp.model;

public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " eats " + food);
    }

    @Override
    public void displayInfo() {
        System.out.println("Dog - Name: " + getName() + ", Age: " + getAge());
    }
}
