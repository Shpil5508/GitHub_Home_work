/** 
* Java 1. Homework #1
*
* @author Paliev Anton
* @version 12.12.2021
*/
class HomeWork_1 {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSing() {
        int a = -1,
            b = 1;
         System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    static void compareNumbers() {
        int a = 4,
            b = 4;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
} 