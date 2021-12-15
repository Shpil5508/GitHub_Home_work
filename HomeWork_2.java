/** 
* Java 1. Homework #2
*
* @author Paliev Anton
* @version 14.12.2021
*/
class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 10));         // п.1 ДЗ
        positiveOrNegative(0);                       // п.2 ДЗ
        System.out.println(whatNumber(0));           // п.3 ДЗ
        wordAndNumber("happy ", 3);                  // п.4 ДЗ
        isYearVisikosniy(400);
    }
    
    static boolean checkSum (int a, int b) {         // п.1 ДЗ
        return a + b >= 10  && a + b <= 20;
    }
    
    static void positiveOrNegative (int a) {         // п.2 ДЗ
       System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
       }
       
    static boolean whatNumber (int a) {   // п.3 ДЗ
        return a < 0;
        }

    static void wordAndNumber (String w, int a)   {    // п.4 ДЗ
        for (int j = 0; j < a; j++) {
            System.out.print(w);
        }
        System.out.println();
    }
    
    static void isYearVisikosniy (int year) {
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "Год высокосный" : "Год невысокосный");
    }
}