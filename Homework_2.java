package Lesson_2.Homework_2;

public class Homework_2 {
    public static void main(String[] args) {
        String[][] arr = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            System.out.println("Summ: " + sumArrayElement(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static int sumArrayElement(String[][] arrARg ) throws MyArraySizeException, MyArrayDataException {
        int a = 0;
        if (arrARg.length != 4) {
            throw new MyArraySizeException ("В массиве не 4 строки");
        }
        for (int i =0; i < arrARg.length; i++) {
            if (arrARg[i].length != 4) {
                throw new MyArraySizeException ("В строке " + i + " не 4 элемента");
            }
            for (int j =0; j < arrARg.length; j++) {
                try {
                    a += Integer.parseInt(arrARg[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Cannot convert element " + i + "x" + j);
                }
            }
        }
        return a;
    }

    private static class MyArraySizeException extends Exception {
        public MyArraySizeException(String s) {
            super(s);
        }
    }

    private static class MyArrayDataException extends Exception {
        public MyArrayDataException(String s) {
            super(s);
        }
    }
}


