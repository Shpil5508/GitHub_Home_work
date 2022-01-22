package Lesson_3.HW_3;

import java.util.ArrayList;

public class Box<T> {

    private double weightFruit = 0.0;
    ArrayList<T> fruits = new ArrayList();

    public <T> Box(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getWeight() - box.getWeight()) < 0.00001;
    }

    public void addFruits(Box<T> boxFruit){
        System.out.println("Ящик №1 до добавления фруктов: " + fruits.size());
        System.out.println("Ящик №2 до добавления фруктов: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("Ящик №1 после добавления фруктов: " + fruits.size());
        System.out.println("Ящик №2 после добавления фруктов: " + boxFruit.fruits.size());
    }

}
