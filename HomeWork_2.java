/** 
* Java 1. Homework #2
*
* @author Paliev Anton
* @version 12.12.2021
*/
class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 20));         // п.1 домашнего задания
        System.out.println(positiveOrNegative(0));   // п.2 домашнего задания
        System.out.println(whatNumber(1));           // п.3 домашнего задания
        System.out.print(wordAndNumber("word ", 5)); // п.4 домашнего задания
    }
    
    static boolean checkSum (int a, int b) {   // п.1 домашнего задания
        if (a + b >= 10 || a + b <= 20) {
            return true;
        }
        return false;
    }
    
    static String positiveOrNegative (int a) {      // п.2 домашнего задания
       return a >= 0 ? "Число положительное" : "Число отрицательное";
       }
       
    static boolean whatNumber (int a) {   // п.3 домашнего задания
        if (a < 0) {
            return true;
        }
        return false;
        }
        
    static String wordAndNumber (String a, int i)   {   // п.4 домашнего задания
        String result = "";
        for (int j = 0; j< i; j++) {
            result = result + a;
        }
        return result;
    }
}