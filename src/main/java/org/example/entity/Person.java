package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.enums.Sexe;
import org.example.enums.SituationMarital;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private Sexe sexe;
    private Integer age;
    private SituationMarital maritalStatus = SituationMarital.SINGLE;
}
