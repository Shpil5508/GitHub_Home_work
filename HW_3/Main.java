package Lesson_3.HW_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d"};
        doLesson_Array(array, 1,2);

        Box<Apple> appleBox = new Box<>(1);
        Box<Orange> orangeBox = new Box<>(1.5);
        Box<Apple> appleBox2 = new Box<>(1);

        int quantityAll = 3; //сколько фруктов добавить в каждую коробку
        int quantityApple = 2; //сколько яблок добавить в коробку
        int quantityOrange = 1; //сколько апельсинов добавить в коробку

        for (int i = 0; i < quantityAll; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }
        for (int i = 0; i < quantityApple; i++) {
            appleBox.addFruit(new Apple());
        }
        for (int i = 0; i < quantityOrange; i++) {
            orangeBox.addFruit(new Orange());
        }

        System.out.println("Масса ящика с яблоками = " + appleBox.getWeight());
        System.out.println("Масса ящика с апельсинами = " + orangeBox.getWeight());
        System.out.println("Сравнение массы коробок: " + appleBox.compare(orangeBox));
        System.out.println();

        appleBox.addFruits(appleBox2);
    }

    public static void doLesson_Array(Object[] array, int oneI, int twoI) {
        System.out.print("До смены места элементов: ");
        System.out.println(Arrays.toString(array));
        Object a = array[oneI];
        array[oneI] = array[twoI];
        array[twoI] = a;

        System.out.print("После смены места элементов: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
}
