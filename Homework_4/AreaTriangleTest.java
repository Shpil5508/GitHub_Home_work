package com.geekbrains.lesson_4.Homework_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaTriangleTest {
    @Test
    void culcAreaTest() throws Exception {
        Assertions.assertEquals(AreaTriangle.areaTriangle(2, 2, 3), 1.984313483298443);
    }

    @Test
    @DisplayName("Проверка на срабатывания Exception при условии, что одна из сторон меньше 0")
    void negativeCulcAreaTest() {
        Assertions.assertThrows(Exception.class, () -> AreaTriangle.areaTriangle(-1, 2, 2));
    }

    @Test
    @DisplayName("2 стороны треугольника больше чем третья")
    void culcAreaTest_2() {
        Assertions.assertThrows(Exception.class, () -> AreaTriangle.areaTriangle(1, 1, 3));
    }
}
