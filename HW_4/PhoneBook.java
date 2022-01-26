package Lesson_4.HW_4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void addElement(String name, String phone) {
        HashSet<String> phones;
        if (phoneBook.containsKey(name)) {
            phones = phoneBook.get(name);
        }
        else {
            phones = new HashSet<>();
        }
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public Set<String> getPhonesName(String name){
        return phoneBook.get(name);
    }
}
