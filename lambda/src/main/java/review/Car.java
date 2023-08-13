package review;

import lombok.*;

@Getter
@Setter
@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
//@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Car {

    private String make;
    private int topSpeed;
    private final int year;
}
