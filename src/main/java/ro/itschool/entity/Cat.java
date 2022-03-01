package ro.itschool.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cat {

    @Id
    private int id;
    private String name;
    private String colour;



}
