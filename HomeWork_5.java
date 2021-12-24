/**
 * Java 1. Homework #5
 *
 * @author Paliev Anton
 * @version 24.12.2021
 */
class HomeWork_5 {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Ivanov Ivan", "owner", "ivanov@mail.com", "89996665544", 1000000, 56);
        person[1] = new Person("Petrov Petya", "general manager", "petrov_p@mail.com", "8987654321", 500000, 40);
        person[2] = new Person("Orlov Petr", "worker", "orlov_p@mail.com", "81112223334", 70000, 28);
        person[3] = new Person("Karpov Sergey", "jedi", "jedi@mail.com", "8467986423", 100000, 34);
        person[4] = new Person("Somov Vasiliy", "cleaner", "cleaner@mail.com", "8123456789", 30000, 65);
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                System.out.println(person[i]);
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}