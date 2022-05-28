package Lesson_4.HW_4;

public class Main {

    public static void main(String[] args) {
        WordsArray wordsArray = new WordsArray(arrayWords());
        wordsArray.doArrayWords();
        phoneBook();
    }

    private static String[] arrayWords() {
        String [] strings = {"Яблоко", "Машина", "Дерево", "Машина", "Фрукт", "Молоток", "Яблоко", "Тестирование", "Java", "Core", "Молоток"};
        return strings;
    }

    private static void phoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElement("Gerg","8646546546");
        phoneBook.addElement("Gerg","86546546855");
        phoneBook.addElement("Ant","537537575");
        phoneBook.addElement("Ant","1111111111");
        phoneBook.addElement("Zif","2222222222");

        System.out.println("Gerg: " + phoneBook.getPhonesName("Gerg"));
        System.out.println("Ant: " + phoneBook.getPhonesName("Ant"));
        System.out.println("Zif: " + phoneBook.getPhonesName("Zif"));
    }
}
