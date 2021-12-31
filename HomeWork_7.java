/**
 * Java 1. Homework #7
 *
 * @author Paliev Anton
 * @version 31.12.2021
 */
class HomeWork_7 {
    public static void main(String[] args) {
        Cat[] cats = { 
        new Cat("Barsik", 15), 
        new Cat("Belyash", 10), 
        new Cat("Barni", 20)
        };
        Plate plate = new Plate(30);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }     
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }
    
    void setFullness (boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "{ Cat: " + name + ", appetite: " + appetite + ", fullness: " + fullness + " }";
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    
    void add(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Food in plate: " + food;
    }
}
