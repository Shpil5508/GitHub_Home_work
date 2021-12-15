/** 
* Java 1. Homework #3
*
* @author Paliev Anton
* @version 15.12.2021
*/
import java.util.Arrays;

class HomeWork_3 {
    public static void main(String[] args) {
        changeNullOnOne();          // п.1 ДЗ
        array100();                 // п.2 ДЗ
        arrayMultiply_2IfLessThen_6();      // п.3 ДЗ
        arrayTwodimensional();              // п.4 ДЗ
        arrayLenAndInitialValue(3, "NewYear!");          // п.5 ДЗ
    }
    
    static void changeNullOnOne() {                 // п.1 ДЗ
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else if (arr[i] == 0) {
                    arr[i] = 1;
                }
            }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    
    static void array100() {                        // п.2 ДЗ
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    
    static void arrayMultiply_2IfLessThen_6() {     // п.3 ДЗ
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *=2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    
    static void arrayTwodimensional() {             // п.4 ДЗ
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } 
            System.out.print(arr[i][j] + " ");
            }
        System.out.print("\n"); 
        }
    }
    
    static void arrayLenAndInitialValue(int len, String initialValue) {     // п.5 ДЗ
        String[] arrayLen = new String[len];
        for (int i = 0; i < arrayLen.length; i++) {
            arrayLen[i] = initialValue;
        }
        System.out.println(Arrays.toString(arrayLen));
    }
    
}