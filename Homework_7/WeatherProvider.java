package Lesson_7.Homework_7;
import Lesson_7.Homework_7.enums.Periods;
import Lesson_8.project.entity.WeatherData;

import java.io.IOException;

public interface WeatherProvider {
    void getWeather(Periods period) throws IOException;
}
