package Lesson_8.Homework_8.provider;

import Lesson_8.Homework_8.entity.WeatherData;
import Lesson_8.Homework_8.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
