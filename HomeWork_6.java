/**
 * Java 1. Homework #6
 *
 * @author Paliev Anton
 * @version 28.12.2021
 */
class HomeWork_6 {
    public static void main(String[]args) {
        IAnimal cat = new Cat(200);
        IAnimal dog = new Dog(500, 10);
        IAnimal[]animals = {cat, dog};
        for (IAnimal animal: animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println("Животных: " + Animal.getCountOfAnimals());
    }
}

class Cat extends Animal {

    Cat(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    Cat(int runLimit) {
        super(runLimit, 0);
    }

     @ Override
    public String swim(int distance) {
        return getClassName() + " не может плавать";
    }
}

class Dog extends Animal {

    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

     @ Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " не сможег пробежать " + distance;
        } else {
            return className + " пробежал " + distance;
        }
    }

     @ Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " не cмог проплыть " + distance;
        } else {
            return className + " проплыл " + distance;
        }
    }

     @ Override
    public String toString() {
        return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}