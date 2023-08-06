package task;

import lombok.*;

@Data
@Builder
public class Orange {

    private int weight;
    private Color color;
}


//@Builder generates an @AllArgsConstructor unless there is another @Constructor
