package review;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
//@AllArgsConstructor
@Builder
@ToString
public class Car {

    private String make;
    private int topSpeed;
    private final int year;
}
