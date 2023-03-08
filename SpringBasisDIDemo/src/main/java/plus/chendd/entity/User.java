package plus.chendd.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String name;
    private Integer age;
    private Dog dog;
}
