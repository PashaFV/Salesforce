package tests;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Car{
    String make;
    String model;
    int maxSpeed;
}
