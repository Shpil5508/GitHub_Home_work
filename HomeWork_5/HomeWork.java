package Lesson_5.HomeWork_5;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("./src/Lesson_5/HomeWork_5/file_origin.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("./src/Lesson_5/HomeWork_5/next_file_origin.csv");
    }
}
