package lesson_5.Homework_5;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    private Integer id;
    private String title;
    private Integer price;
    private String categoryTitle;
}
