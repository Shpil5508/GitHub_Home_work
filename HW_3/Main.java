package Lesson_3.HW_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d"};
        doLesson_Array(array, 1,2);

        Box<Apple> appleBox = new Box<>(1);
        Box<Orange> orangeBox = new Box<>(1.5);
        Box<Apple> appleBox2 = new Box<>(1);

        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

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
