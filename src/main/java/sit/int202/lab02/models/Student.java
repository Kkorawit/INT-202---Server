package sit.int202.lab02.models;

import jakarta.ws.rs.GET;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {
    private Integer id;
    private String name;
    private Double gpax;
}
