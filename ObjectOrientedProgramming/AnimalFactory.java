// Design Patterns Examples

// Animal.java - Base class for Factory Pattern
abstract class Animal {
    public abstract void makeSound();
    public abstract String getSpecies();
    
    public void sleep() {
        System.out.println(getSpecies() + " is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    
    @Override
    public String getSpecies() {
        return "Dog";
    }
    
    public void wagTail() {
        System.out.println("Dog is wagging tail");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
    
    @Override
    public String getSpecies() {
        return "Cat";
    }
    
    public void purr() {
        System.out.println("Cat is purring");
    }
}

// AnimalFactory.java - Factory Pattern implementation
class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
    
    // Overloaded method for creating animals with specific characteristics
    public static Animal createAnimal(String type, boolean isDomestic) {
        Animal animal = createAnimal(type);
        if (isDomestic) {
            System.out.println("Created a domestic " + animal.getSpecies());
        } else {
            System.out.println("Created a wild " + animal.getSpecies());
        }
        return animal;
    }
}