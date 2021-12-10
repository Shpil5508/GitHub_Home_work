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
        /* if (a + b >= 0) {
        System.out.println("Сумма положительная");
        } else {
         System.out.println("Сумма отрицательная");
        } */
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная"); //очень удобный тернарный оператор
    }

    static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

    static void compareNumbers() {
        int a = 4,
            b = 4;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
} 
