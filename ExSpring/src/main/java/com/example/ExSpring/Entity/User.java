package com.example.ExSpring.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    private int id;
    private String name;
    private String surname;
    private String dni;
}